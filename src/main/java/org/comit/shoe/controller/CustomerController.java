package org.comit.shoe.controller;

import java.util.List;

import org.comit.shoe.Bean.Customer;
import org.comit.shoe.service.CustomerService;
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
public class CustomerController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
 	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public String index() {

		return "index";
	}
	
	@GetMapping("/list")
	public ModelAndView list() {
     
		logger.debug("Listing Customers");
		
		List<Customer> customers = this.customerService.list();

		return new ModelAndView("list","customers",customers);
	}
	
	@GetMapping("/create")
	public String showCreate() {
		
		logger.debug("Show Customer");
		
		return "create";
	}
	
	@PostMapping("/create")
	public String createCustomer(HttpServletRequest req) {
		
		logger.debug("Create Customer");

		String first = req.getParameter("first");
		String last = req.getParameter("last");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String phone = req.getParameter("phone");
		String sex = req.getParameter("sex");

		Customer customer = this.createCustomer(null,first, last, email, password, address, city, phone, sex);

		this.customerService.createCustomer(customer);

		return "redirect:/list";
	    }
  
	     @GetMapping("/update/{id}")
  	     public ModelAndView showUpdate(@PathVariable int id) {
	    	 
	    	 logger.debug("Show update");

		     Customer customer = this.customerService.findcustomer(id);

		  return new ModelAndView("update","customerr",customer);
	    }

           @PostMapping("/update")
           public String updateCustomer(HttpServletRequest req) {
        	   
        	   logger.debug("update Customer");
	
	 		String id = req.getParameter("id");
	 		String first = req.getParameter("first");
	 		String last = req.getParameter("last");
	 		String email = req.getParameter("email");
	 		String password = req.getParameter("password");
	 		String address = req.getParameter("address");
	 		String city = req.getParameter("city");
	 		String phone = req.getParameter("phone");
	 		String sex = req.getParameter("sex");

	
	 		Customer customer = this.createCustomer(id, first, last, email, password, address, city,phone,sex);
	
	 		   this.customerService.updateCustomer(customer);
	
	 		return "redirect:/list";
	 	}
           
		@GetMapping("/delete/{id}")
	 	public String deleteCustomer(@PathVariable int id) {
	
			logger.debug("Delete Customer");
			
	 		this.customerService.deleteCustomer(id);
	
	 		return "redirect:/list";
	 	}
	
		private Customer createCustomer(String id, String first, String last, String email, String password,
				String address, String city, String phone, String sex) {
			
	 		Customer customer = new Customer(0, first,last,email,password, address, city, phone,sex);
			return customer;
		}
	
	
  }

