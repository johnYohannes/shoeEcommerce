package org.comit.shoe.dao;


import java.util.ArrayList;
import java.util.List;

import org.comit.shoe.Bean.Customer;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerDao {
	
	 List<Customer> customers;	 

		public CustomerDao() {

			this.customers = new ArrayList<>();

			//customers.add(new Customer(1,"John","Doe","jon@gmail.com","123","A", null, 0, null));
			
			//customers.add(new CustomerBean(2,"Jane","Smith","jsmith","123",Util.parseDate("1995-06-07"),"A"));
			//customers.add(new CustomerBean(3,"Pete","Roberts","proberts","123",Util.parseDate("1984-07-09"),"A"));			
		}

		public List<Customer> list() {		

			return this.customers;
		}
		
		public void createCustomer(Customer customer) {

			int max = this.customers.stream()
					         .mapToInt(u -> u.getIdCustomer())
					         .max().orElse(0);

			customer.setIdCustomer(++max);
			customer.setSex("F");

			this.customers.add(customer);

		}
	
}
