package org.comit.shoe.dao;

import java.util.List;

import org.comit.shoe.Bean.Order;
import org.comit.shoe.dao.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDoa {

	 @Autowired
	    JdbcTemplate jdbcTemplate;
	    
	    
		public List<Order> list() {		
			
			String sql = "SELECT * FROM Order";
			
			return this.jdbcTemplate.query(sql, new OrderMapper());
		}
}
