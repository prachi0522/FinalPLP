package com.capgemini.storesmanagementsystem.service;

import org.junit.jupiter.api.Test;

import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;

class AdminServiceImplTest {
	AdminServiceImpl a1=new AdminServiceImpl();
	
	@Test
	void test() {
		a1.loginAdmin("prachi","Prachi@2", "abc");
	}
	
	@Test
	void test1() {
		a1.addManufacturer(new UserDetailsInfo("184","Riti","Ru@gmail.com","Ritika@1","Baihar","dealer"));
	}
	
	@Test
	void test2() {
		a1.updateManufacturer("127",new UserDetailsInfo("161","Sina","Si@gmail.com","Sina@134","Nagpur","admin"));
	}
	
	@Test
    void test3() {
		a1.deleteManufacturer("129");
	}
	
	@Test
	void test4() {
		a1.viewAllManufacturers();
	}
	
	
}
