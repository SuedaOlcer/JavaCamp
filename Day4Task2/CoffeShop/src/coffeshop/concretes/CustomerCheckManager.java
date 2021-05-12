package coffeshop.concretes;

import coffeshop.abstracts.CustomerCheckService;
import coffeshop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	
	
	@Override
	public boolean  checkIfRealPerson(Customer customer) {
		
	    return true;
	}


	
     
}
