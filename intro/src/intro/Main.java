package intro;

public class Main {

	public static void main(String[] args) {
		//camelCase:değişken isimlendirme 
		//Değişkenler
		String internetSubeButonu="İnternet Şubesi";
		double dolarDun=8.15;
		double dolarBugun=8.20;
		//int vade=36;
		//boolean dustuMu=false;
		System.out.println(internetSubeButonu);

		//Şart blokları
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düştü");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi");
		}
		else {
			System.out.println("Dolar eşittir");
		}

		//Diziler
		String[] krediler= {
				"Hızlı Kredi",
				"Mutlu Emekli Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi"
};

		//Döngüler
		for(String kredi:krediler) {
			System.out.println(kredi);
		}

		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}

		//Değer ve Referans Tipler
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=70;
		System.out.println(sayi1);

		int[]sayilar1= {1,2,3,4,5};
		int[]sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=99;
		System.out.println(sayilar1[0]);

		//String normalde char array olarak tutulur.
		//Arrayler referans tiptir fakat Stringler burada istisnai durumdur
		String sehir1="Ankara";
		String sehir2="İstanbul";
		sehir1=sehir2;
		sehir2="İzmir";
		System.out.println(sehir1);
	}

}