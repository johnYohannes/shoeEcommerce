package org.comit.shoe.Bean;

//import java.util.Date;

public class Customer {
  
	int idCustomer;
	String firstName;
	String lastName;
	String email;
	String password;
	String address;
	String city;
    String phone;
	String sex;
	
	
	public Customer() {
		super();
	}

	public Customer(int idCustomer, String firstName, String lastName, String email, String password, String address,
			String city, String phone, String sex) {
		this.idCustomer = idCustomer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.sex = sex;
	}
	
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return String.format(
			            "Customer [idCustomer=%s, firstName=%s, lastName=%s, email=%s, password=%s, address=%s, city=%s, phoneNumber=%s, sex=%s]",
			            idCustomer,firstName,lastName,email,password,address,city,phone,sex);
		 }
	}
	

	

