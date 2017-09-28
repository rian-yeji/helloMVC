package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customerMap;

	public CustomerService() {
		customerMap = new HashMap<String, Customer>();
		
		addCustomer(new Customer("id001","a","a.hansung"));
		addCustomer(new Customer("id002","b","b.hansung"));
		addCustomer(new Customer("id003","c","c.hansung"));
		addCustomer(new Customer("id004","d","d.hansung"));
		addCustomer(new Customer("id005","e","e.hansung"));
		
	}
	
	private void addCustomer(Customer customer) {
		customerMap.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		
		if(id != null) {
			return customerMap.get(id.toLowerCase());
		}
		else
			return null;
			
	}
	
	public List<Customer> getAllCustomers(){
		List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
		
		return customerList;
	}
}
