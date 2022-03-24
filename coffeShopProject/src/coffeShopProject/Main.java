package coffeShopProject;
import java.rmi.RemoteException;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException{
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Metin","Arslan",2000,"16694478700"));
	}

}

