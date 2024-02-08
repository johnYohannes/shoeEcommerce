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

	
        this.customerDao.createCustomer(customer);
	}
	
	 public Customer findcustomer(int idCustomer) {

			return this.customerDao.findCustomer(idCustomer);
	 }
		
	 public void updateCustomer(Customer customer) {
			this.validateCustomer(customer);
			this.customerDao.updateCustomer(customer);
	 }
		
	 public void deleteCustomer(int idCustomerr) {

			this.customerDao.deleteCustomer(idCustomerr);
	 }
	 
	 
	  private void validateCustomer(Customer customer) {
			if(customer.getFirstName().isEmpty()||
					customer.getLastName().isEmpty()){
					throw new RuntimeException("Invalid Customer Data" + customer);
			       }
	     }
	
	
}
