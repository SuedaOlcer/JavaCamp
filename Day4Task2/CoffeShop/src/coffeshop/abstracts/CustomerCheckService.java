package coffeshop.abstracts;

import coffeshop.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
