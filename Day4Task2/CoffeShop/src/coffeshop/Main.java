package coffeshop;

import java.util.Date;

import coffeshop.abstracts.BaseCustomerManager;
import coffeshop.adapters.MernisServiceAdapter;
import coffeshop.concretes.NeroCustomerManager;
import coffeshop.concretes.StarbucksCustomerManager;
import coffeshop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(); 
		
		try {
			starbucksCustomerManager.save(new Customer(1, "Sueda","Olcer", new Date(3999,01,01),"1111111111"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
     	System.out.println("********************************************");
		
		try {
			neroCustomerManager.save(new Customer(1, "Sueda","Olcer", new Date(3999,01,01),"1111111111"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
