package org.comit.shoe.service;

import java.util.List;

import org.comit.shoe.Bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.comit.shoe.dao.OrderDoa;
@Service
public class OrderService {
	
	@Autowired
	OrderDoa orderDao;
	
	public List<Order> list(){
		return this.orderDao.list();
		}
	
}
