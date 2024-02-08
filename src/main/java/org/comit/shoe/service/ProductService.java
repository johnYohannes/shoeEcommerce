package org.comit.shoe.service;

import java.util.List;

import org.comit.shoe.Bean.Product;
import org.comit.shoe.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	    @Autowired
	    ProductDao productdao;
	    
	    public List<Product> listp() {

			List<Product> products = this.productdao.listp();

			return products;
		}
	    
	    public void createProduct(Product product) {

	    	
	        this.productdao.createProduct(product);
		}
	    
	    public  Product findProduct(int idProduct) {

	    	return this.productdao.findProduct(idProduct);

		}
	    
	    public void updateProduct(Product product) {
	    	
			this.validateProduct(product);
			
			this.productdao.updateProduct(product);
	 }
		
	
	public void deleteProduct(int idProduct) {

			this.productdao.deleteProduct(idProduct);
	 }
	 
	 

	 
	  private void validateProduct(Product product) {
			if(product.getBrand().isEmpty()||
					product.getSize().isEmpty()){
					throw new RuntimeException("Invalid product Data" + product);
			       }
	     }
}
