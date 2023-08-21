package org.comit.shoe.controller;

import java.util.List;

import org.comit.shoe.Bean.Customer;
import org.comit.shoe.service.CustomerService;
import org.comit.shoe.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class CustomerController {

	
	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public String index() {

		return "index";
	}
	
	@GetMapping("/list")
	public ModelAndView list() {

		List<Customer> customers = this.customerService.list();

		return new ModelAndView("list","users",customers);
	}
	@GetMapping("/create")
	public String showCreate() {
		
		return "create";
	}
	
	@PostMapping("/create")
	public String createCustomer(HttpServletRequest req) {

		String first = req.getParameter("first");
		String last = req.getParameter("last");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String city = req.getParameter("city");
		String phoneNumber = req.getParameter("phoneNumber");
		String sex = req.getParameter("sex");

		Customer customer = this.createCustomer(null,first, last, email, password, address, city, phoneNumber);

		this.customerService.createCustomer(customer);

		return "redirect:/list";
	  }

	private Customer createCustomer( String first, String last, String email, String password,
			String address, String city, String phoneNumber, String sex) {
		Customer customer = new Customer(0, first,last,email,password, address, city, phoneNumber,sex);
		return customer;
	}
	
}
