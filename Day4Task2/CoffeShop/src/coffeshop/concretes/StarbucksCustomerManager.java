package coffeshop.concretes;

import coffeshop.abstracts.BaseCustomerManager;
import coffeshop.abstracts.CustomerCheckService;
import coffeshop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		
	 if( this.customerCheckService.checkIfRealPerson(customer)) {
		 super.save(customer);
		 
	 }
	 else {
		 System.out.println("Gerçek bir kiþi deðildir");
		 throw new Exception ("not a valid person");
	 }
	
		
	}
		
	

}
