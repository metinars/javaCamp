package Adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy clinet = new KPSPublicSoapProxy();
		
		boolean result = true;
		try {
			result = clinet.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
		}catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
