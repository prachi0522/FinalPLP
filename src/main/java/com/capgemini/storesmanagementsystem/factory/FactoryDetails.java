package com.capgemini.storesmanagementsystem.factory;

import com.capgemini.storesmanagementsystem.dao.AdminDao;
import com.capgemini.storesmanagementsystem.dao.AdminDaoImpl;
import com.capgemini.storesmanagementsystem.dao.DealerDao;
import com.capgemini.storesmanagementsystem.dao.DealerDaoImpl;
import com.capgemini.storesmanagementsystem.dao.ManufacturerDao;
import com.capgemini.storesmanagementsystem.dao.ManufacturerDaoImpl;
import com.capgemini.storesmanagementsystem.service.AdminService;
import com.capgemini.storesmanagementsystem.service.AdminServiceImpl;
import com.capgemini.storesmanagementsystem.service.DealerService;
import com.capgemini.storesmanagementsystem.service.DealerServiceImpl;
import com.capgemini.storesmanagementsystem.service.ManufacturerService;
import com.capgemini.storesmanagementsystem.service.ManufacturerServiceImpl;

public class FactoryDetails {
	private FactoryDetails() {

	}

	public static AdminDao objectAdminDao() {
		AdminDao adao = new AdminDaoImpl();
		return adao;
	}

	public static AdminService objectAdminService() {
		AdminService sDao = new AdminServiceImpl();
		return sDao;
	}

	public static ManufacturerDao objectManufacturerDao() {
		ManufacturerDao daoc = new ManufacturerDaoImpl();
		return daoc;
	}

	public static ManufacturerService objectManufactureServices() {
		ManufacturerService conServ = new ManufacturerServiceImpl();
		return conServ;
	}

	public static DealerDao objectDealerDao() {
		DealerDao Daoc = new DealerDaoImpl();
		return Daoc;
	}

	public static DealerService objectDealerServices() {
		DealerService custServ = new DealerServiceImpl();
		return custServ;
	}

}
