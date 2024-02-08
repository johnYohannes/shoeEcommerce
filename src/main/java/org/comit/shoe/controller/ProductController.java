package org.comit.shoe.controller;

import java.util.List;

import org.comit.shoe.Bean.Product;
import org.comit.shoe.service.OrderService;
import org.comit.shoe.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
		@Autowired
		OrderService orderService;
		
		@Autowired
		ProductService productService;
	    /*
		@GetMapping("/")
		public String index() {
	
			return "index";
		}
		*/
	
		@GetMapping("/listp")
		public ModelAndView listp() {
	     
			//logger.debug("Listing products");
			
			List<Product> products = this.productService.listp();
			
			products.stream().forEach(p->logger.info("Listing product::{}",p.toString()));
			//logger.info("Listing product::{}",products.get(0).getBrand());
			   
			return new ModelAndView("listp","products",products);
		}
		
		
			@GetMapping("/updatepro")
			public String showCreate() {
				
				//logger.debug("Show Customer");
				
				return "listp";
			}
		/*	
			@PostMapping("/pdate")
			public String createProduct(HttpServletRequest req) {
				
			//	logger.debug("Create Product");
		
				String Brand = req.getParameter("Brand");
				String Size = req.getParameter("Size");
				String Price = req.getParameter("Price");
				String Description = req.getParameter("Description");
				Product product = this.createProduct(null,brand,size, price, description, date,idOrder);
				
		
			   Product product = this.createProduct (null,Brand, Size, Price, Description);
		
				 this.productService.createProduct(product);
		
				return "redirect:/listp";
			   }
		*/
	        @GetMapping("/updatepro/{id}")
	        
		     public ModelAndView showUpdate(@PathVariable int id) {
		    	 
		    	// logger.debug("Show update");
	
			     Product product= this.productService.findProduct(id);
	
			  return new ModelAndView("updatepro","product",product);
		    }
	
	        @PostMapping("/updatePro")
	        
	         public String updateProductr(HttpServletRequest req) {
	      	   
	      	 //  logger.debug("update Customer");
		
	 		String id = req.getParameter("id");
	 		String brand = req.getParameter("brand");
	 		String size = req.getParameter("size");
	 		String price = req.getParameter("price");
	 		String description = req.getParameter("description");
	 		
             Product product = this.createProduct(id, brand, size, price, description);
		
		 		   this.productService.updateProduct(product);
		
		 		return "redirect:/Prolist";
		 	}
	      
	        @GetMapping("/deletePro/{id}")
	        
		 	public String deleteProduct(@PathVariable int id) {
		
				//logger.debug("Delete Product");
				
		 		this.productService.deleteProduct(id);
		
		 		return "redirect:Prolist";
		 	}
		
			private Product createProduct(String id, String brand, String size,String price, String description) {
				
		 		Product product = new Product();
		 		
				return product;
			}
}
