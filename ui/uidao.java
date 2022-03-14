package ui;

import java.util.ArrayList;

public class uidao {
	
	private ArrayList<backend> curCus = new ArrayList<>();

	//CRUD - Create Method
	public void addNewCustomer(backend cust) {
		curCus.add(cust);
		System.out.println("Successfull added " + cust.getFirstName() );
	}
	
	//CRUD - Read 
	public void showAllCustomers() {
		for(backend arrayItem : curCus) {
			System.out.println("Customer Name: - " + arrayItem.getFirstName());

		}
	}
	
	//CRUD - Update Name
	
	public void updateFirstName(backend cust) {
		curCus.set(0, cust);
		System.out.println("Successfully updated Name");
		
	}
	
	//CRUD - Delete 
	
	public void deletingCustomer(backend cust) {
		curCus.remove(cust);
		System.out.println("Successfully Deleted");
		
	
	
	}
}
