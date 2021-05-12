package coffeshop.adapters;

import java.rmi.RemoteException;

import coffeshop.abstracts.CustomerCheckService;
import coffeshop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy kpsPuclicSoapProxy =new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = kpsPuclicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastname(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return result;
	}

}
