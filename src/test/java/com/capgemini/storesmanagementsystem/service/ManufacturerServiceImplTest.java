package com.capgemini.storesmanagementsystem.service;

import org.junit.jupiter.api.Test;

import com.capgemini.storesmanagementsystem.dao.ManufacturerDaoImpl;
import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

class ManufacturerServiceImplTest {
	ManufacturerDaoImpl m1=new ManufacturerDaoImpl();
	
	@Test
	void test() {
      m1.addDealer(new UserDetailsInfo("190","Rohit","r@gmail.com","Rohit@12","Andhra","admin"));
	}
	
	
	@Test
	void test1() {
		m1.modifyDealer("111", new UserDetailsInfo("900","Mohit","m@gmail.com","Mohit@12","Wakad","admin"));
	}
    
	
	@Test
	void test2() {
		m1.removeDealer("122");
	}
	
	
	@Test
	void test3() {
		m1.viewAllDealers("Admin");
	}
	
	@Test
	void test4() {
		m1.addProduct(new ProductDetailsInfo(19,"slipper",2000.0,3,"sparx"));
	}
	
	@Test
	void test5() {
		m1.modifyProduct(new ProductDetailsInfo(28,"shoe",3000.0,4,"bata"));
	}
	
	@Test
	void test6() {
	  m1.removeProduct(20);	
	}
	
	@Test
	void test7() {
		m1.viewAllProducts();
	}
	
	@Test
	void test8() {
		m1.viewAllOrders();
	}
	
	@Test
	void test9() {
		m1.viewStore();
	}
	
//	@Test
//	void test10() {
//		m1.passwordValidate("Herry@12");
//	}
	
	
}
