package com.capgemini.storesmanagementsystem.dao;

import java.util.List;

import com.capgemini.storesmanagementsystem.dto.OrderDetailsInfo;

public interface DealerDao {
//public boolean loginDealer(String name,String password,String id);
	
	public boolean makeOrder(OrderDetailsInfo order);
	public boolean deleteOrder(Integer orderId);
	public List<String> showAllproducts();
	public List<String> viewMyOrders(String userId);
	public List<String> viewMyStore(int storeId);


}
