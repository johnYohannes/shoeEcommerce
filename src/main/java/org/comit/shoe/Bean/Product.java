package org.comit.shoe.Bean;

public class Product {

	int idProduct;
	String brand;
	String size;
	String price;
	String description;
	
	Order order;
	
	public Product() {
		super();
		
	}

    public Product(int idProduct, String brand, String size, String price, String description,Order order) {
		this.idProduct = idProduct;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.description = description;
		this.order = order;
	}

	public int getIdProduct() {
		return idProduct;
	}
    public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
    public String getBrand() {
		return brand;
	}
     public void setBrand(String brand) {
		this.brand = brand;
	}

     public String getSize() {
		return size;
	}

    public void setSize(String size) {
		this.size = size;
	}

    public String getPrice() {
		return price;
	}
    public void setPrice(String price) {
		this.price = price;
	}
    public String getDescription() {
		return description;
	}
    public void setDescription(String description) {
		this.description = description;
	}

    public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

   @Override
	public String toString() {
		return String.format(
			            "Product [idProduct=%s, brand=%s, size=%s, price=%s, description=%s]",
			            idProduct,brand,size,price,description);
		 }
	
	
}
