package com.capgemini.storesmanagementsystem.service;

import java.util.List;

import com.capgemini.storesmanagementsystem.dao.DealerDao;
import com.capgemini.storesmanagementsystem.dto.OrderDetailsInfo;
import com.capgemini.storesmanagementsystem.validation.PasswordValidate;

public class DealerServiceImpl implements DealerService {
	private DealerDao dao;

//	public boolean loginDealer(String name,String password,String id) {
//		 boolean result=dao.loginDealer(name, password, id);
//		 return result;
//	 }

	public boolean makeOrder(OrderDetailsInfo order) {
		return dao.makeOrder(order);
	}

	public boolean deleteOrder(Integer orderId) {
		return dao.deleteOrder(orderId);
	}

	public List<String> showAllproducts() {
		return dao.showAllproducts();
	}

	public List<String> viewMyStore(int storeId) {
		return dao.viewMyStore(storeId);
	}

	public List<String> viewMyOrders(String userId) {
		return dao.viewMyOrders(userId);
	}

	public boolean passwordValidate(String password) {
		boolean flag = PasswordValidate.validPassword(password);
		return flag;
	}
}
