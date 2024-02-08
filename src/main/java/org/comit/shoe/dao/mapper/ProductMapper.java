package org.comit.shoe.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.comit.shoe.Bean.Product;
import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> {
	
	
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Product product = new Product();
		
		 product.setIdProduct(rs.getInt("ID_Product"));
		 product.setBrand(rs.getString("Brand"));
		 product.setSize(rs.getString("Size"));
		 product.setPrice(rs.getString("Price"));
		 product.setDescription(rs.getString("Description"));
	        
	     return product;  
	}
}

