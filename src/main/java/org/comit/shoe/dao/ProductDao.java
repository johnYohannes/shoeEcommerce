package org.comit.shoe.dao;

import java.util.List;

import org.comit.shoe.Bean.Product;
import org.comit.shoe.dao.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
	
	 List<Product> products;
     
     @Autowired
     JdbcTemplate jdbcTemplate;
     

		public List<Product> listp() {		


			String sql = "SELECT * FROM Product";
			
		    return this.jdbcTemplate.query(sql, new ProductMapper());
		}
		
		public void createProduct(Product product) {

			String sql = "INSERT INTO Product(Brand,Size,Price,Description) " +
	                "VALUES(?,?,?,?)";
			
			this.jdbcTemplate.update(sql, product.getBrand(), product.getSize(), product.getPrice(), product.getDescription());

		}
    
	   public  Product findProduct(int idProduct) {
	  	    String sql = "SELECT * FROM Product WHERE ID_Product=?";
		
		   return this.jdbcTemplate.queryForObject(sql, new ProductMapper(), idProduct);
	     }
		
	   public void updateProduct(Product product) {

		  String sql = "UPDATE Product SET Brand = ?, Size = ?, Price = ?"
	     		   + "Description=? WHERE ID_Product = ? ";
		
		  this.jdbcTemplate.update(sql, product.getBrand(), product.getSize(),product.getPrice(), product.getIdProduct());
	    }
	   public void deleteProduct(int idProduct) {

			 String sql = "DELETE FROM product WHERE ID_Product = ?";
		        
				this.jdbcTemplate.update(sql,idProduct);
		}
		
}
