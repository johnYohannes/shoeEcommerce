package org.comit.shoe.dao;


import java.util.List;

import org.comit.shoe.Bean.Customer;
import org.comit.shoe.dao.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class CustomerDao {
	

      List<Customer> customers;
      
      @Autowired
      JdbcTemplate jdbcTemplate;
      

		public List<Customer> list() {		


			String sql = "SELECT * FROM Customer";
			
			return this.jdbcTemplate.query(sql, new CustomerMapper());
		}
		
		public void createCustomer(Customer customer) {

			String sql = "INSERT INTO customer(First_name, Last_name, Email, Password, Address, City, Phone,Sex) " +
	                "VALUES(?,?,?,?,?,?,?,?)";
			
			this.jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPassword(),
                                             customer.getAddress(),customer.getCity(), customer.getPhone(), customer.getSex());

		}
	
		public  Customer findCustomer(int idCustomer) {

			String sql = "SELECT * FROM Customer WHERE ID_Customer=?";
			
			return this.jdbcTemplate.queryForObject(sql, new CustomerMapper(), idCustomer);

		}

		public void updateCustomer( Customer customer) {

			  String sql = "UPDATE Customer SET First_name = ?, Last_name = ?, Email = ?, Password = ?, Address = ?, City = ?,"
		     		   + "Phone = ? ,Sex = ? WHERE ID_Customer = ? ";
		        
				this.jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPassword(),
						customer.getAddress(), customer.getCity() , customer.getPhone(), customer.getSex(), customer.getIdCustomer());
        }

		public void deleteCustomer(int idCustomer) {

			 String sql = "DELETE FROM Customer WHERE ID_Customer = ?";
		        
				this.jdbcTemplate.update(sql,idCustomer);
		}
		
		
}
