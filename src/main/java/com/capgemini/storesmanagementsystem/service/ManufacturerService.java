package com.capgemini.storesmanagementsystem.service;

import java.util.List;

import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

public interface ManufacturerService {
	// public boolean loginManufacturer(String name, String password,String id);

	public boolean addDealer(UserDetailsInfo dealer);

	public boolean modifyDealer(String userId, UserDetailsInfo user1);

	public boolean removeDealer(String dealerId);

	public List<String> viewAllDealers(String role);

	public boolean addProduct(ProductDetailsInfo product);

	public boolean modifyProduct(ProductDetailsInfo product);

	public boolean removeProduct(Integer productId);

	public List<String> viewAllProducts();

	public List<String> viewAllOrders();

	public List<String> viewStore();
}
