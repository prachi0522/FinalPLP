package com.capgemini.storesmanagementsystem.service;

import java.util.List;

import com.capgemini.storesmanagementsystem.dao.ManufacturerDao;
import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;
import com.capgemini.storesmanagementsystem.validation.PasswordValidate;

public class ManufacturerServiceImpl implements ManufacturerService {
	private ManufacturerDao dao;

//	public boolean loginManufacturer(String name,String password,String id) {
//		 boolean result=dao.loginManufacturer(name, password, id);
//		 return result;
//	 }

	public boolean addDealer(UserDetailsInfo dealer) {
		return dao.addDealer(dealer);
	}

	public boolean modifyDealer(String userId, UserDetailsInfo user1) {
		return dao.modifyDealer(userId, user1);
	}

	public boolean removeDealer(String dealerId) {
		return dao.removeDealer(dealerId);
	}

	public List<String> viewAllDealers(String role) {
		return dao.viewAllDealers(role);
	}

	public boolean addProduct(ProductDetailsInfo product) {
		return dao.addProduct(product);
	}

	public boolean modifyProduct(ProductDetailsInfo product) {
		return dao.modifyProduct(product);
	}

	public boolean removeProduct(Integer productId) {
		return dao.removeProduct(productId);
	}

	public List<String> viewAllProducts() {
		return dao.viewAllProducts();
	}

	public List<String> viewAllOrders() {
		return dao.viewAllOrders();
	}

	public List<String> viewStore() {
		return dao.viewStore();
	}

	public boolean passwordValidate(String password) {
		boolean flag = PasswordValidate.validPassword(password);
		return flag;
	}

	
	
}
