package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer metin = new IndividualCustomer();
		metin.customerNumber = "200408038";
		
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "123456";
		
		Sendika abc = new Sendika();
		abc.customerNumber = "0000000";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {metin, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}
 
}