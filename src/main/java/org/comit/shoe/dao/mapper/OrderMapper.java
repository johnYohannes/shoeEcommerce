package org.comit.shoe.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.jdbc.core.RowMapper;
import org.comit.shoe.Bean.Order;

public class OrderMapper implements RowMapper<Order> {
	
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {

		Order order = new Order();
		
		order.setIdorder(rs.getInt("ID_Order"));
		order.setQuality(rs.getString("Quality"));
		//order.setdate(rs.getString("Date"));
		order.setRating(rs.getString("Rating"));
		
		return order;
	}

}
