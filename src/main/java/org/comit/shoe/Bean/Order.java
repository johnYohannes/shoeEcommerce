package org.comit.shoe.Bean;

import java.util.Date;

public class Order {
     
	 int idorder;
	 String quality;
	 Date date;
	 String rating;
	 
	 
	 
	public int getIdorder() {
		return idorder;
	}
	public void setIdorder(int idorder) {
		this.idorder = idorder;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public Date getdate() {
		return date;
	}
	public void setdate(Date date) {
		this.date = date;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	 
}
