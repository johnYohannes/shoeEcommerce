package org.comit.shoe.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.shoe.Bean.Customer;
import org.springframework.jdbc.core.RowMapper;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
        Customer customer = new Customer();
		
        customer.setIdCustomer(rs.getInt("ID_Customer"));
        customer.setFirstName(rs.getString("First_name"));
        customer.setLastName(rs.getString("Last_name"));
        customer.setEmail(rs.getString("Email"));
        customer.setPassword(rs.getString("Password"));
        customer.setAddress(rs.getString("Address"));
        customer.setCity(rs.getString("City"));
        customer.setPhone(rs.getString("Phone"));
        customer.setSex(rs.getString("Sex"));
       
        
         return customer;
	}

}
