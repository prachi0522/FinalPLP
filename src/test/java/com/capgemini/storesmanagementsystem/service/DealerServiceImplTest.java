package com.capgemini.storesmanagementsystem.service;

import org.junit.jupiter.api.Test;

import com.capgemini.storesmanagementsystem.dao.DealerDaoImpl;
import com.capgemini.storesmanagementsystem.dto.OrderDetailsInfo;

class DealerServiceImplTest {
	DealerDaoImpl d1=new DealerDaoImpl();
	
	@Test
	void makeOrder() {
		d1.makeOrder(new OrderDetailsInfo(1,21,1,"Gwalior",123,"Shivam","Sivam@127"));
	
	}

	
	@Test
	void test1() {
		d1.deleteOrder(35);
	}
	
	
	@Test
	void test2(){
		d1.showAllproducts();
	}
	
	@Test
	void test3(){
		d1.viewMyStore(1);
	}
	
	@Test
	void test4() {
		d1.viewMyOrders("123");
	}
	
//	@Test
//	void test5() {
//		d1.passwordValidate("Rani@123");
//	}

}
