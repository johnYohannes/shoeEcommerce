package org.comit.shoe.service;

import java.util.List;

import org.comit.shoe.Bean.Customer;
import org.comit.shoe.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

	
	@Autowired
	CustomerDao customerDao;


	public List<Customer> list() {

		List<Customer> customers = this.customerDao.list();

		return customers;
	}
	 public void createCustomer(Customer customer) {

			this.createCustomer(customer);

			this.customerDao.createCustomer(customer);
	}
	
	 
	 private void validateCustomer(Customer customer) {
			if(customer.getFirstName().isEmpty()||
					customer.getLastName().isEmpty()){
					throw new RuntimeException("Invalid User Data" + customer);
			       }
	     }
}
