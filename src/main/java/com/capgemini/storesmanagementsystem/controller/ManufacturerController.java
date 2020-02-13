package com.capgemini.storesmanagementsystem.controller;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.capgemini.storesmanagementsystem.dao.ManufacturerDaoImpl;
import com.capgemini.storesmanagementsystem.dto.ProductDetailsInfo;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;
import com.capgemini.storesmanagementsystem.service.ManufacturerService;

public class ManufacturerController {
	private ManufacturerService manufacturerService;
	Logger log = Logger.getLogger("store");
	Scanner scan = new Scanner(System.in);
	ManufacturerDaoImpl dao = new ManufacturerDaoImpl();

	void manufacturerTask() {

		int choice = 0;
		log.info("*********Welcome to Manufacturers Page********");
		log.info("1.Add Dealer");
		log.info("2.Modify Dealer");
		log.info("3.Remove Dealers");
		log.info("4.View Dealers");
		log.info("5.Add Products");
		log.info("6.Modify Products");
		log.info("7.Remove Products");
		log.info("8.View Products");
		log.info("9.View Store");
		log.info("10.Exit");

		do {
			log.info("...................................");
			log.info("Enter Your Choice");
			log.info("...................................");
			choice = scan.nextInt();
			switch (choice) {

			case 1:
				UserDetailsInfo user = new UserDetailsInfo();
				log.info("Enter the UserId");
				String userId = scan.next();
				user.setUserId(userId);

				log.info("Enter the UserName");
				String uname = scan.next();
				user.setUserName(uname);

				log.info("Enter the Email");
				String Email = scan.next();
				user.setEmail(Email);

				log.info("Enter the Password");
				String password = scan.next();
				user.setPassword(password);

				log.info("Enter the address");
				String Address = scan.next();
				user.setAddress(Address);

				log.info("Enter the user role");
				String userRole = scan.next();
				user.setUserRole(userRole);

				dao.addDealer(user);
				log.info("Insert Succesfully");
				break;

			case 2:

				UserDetailsInfo user1 = new UserDetailsInfo();
				log.info("Enter the User id you want to Update");
				String id = scan.next();

				log.info("Enter the Username");
				String name = scan.next();
				user1.setUserName(name);

				log.info("Enter the email");
				String emailid = scan.next();
				user1.setEmail(emailid);

				log.info("Enter the Password");
				String pass = scan.next();
				user1.setPassword(pass);

				log.info("Enter the Address");
				String address = scan.next();
				user1.setAddress(address);

				log.info("Enter the Role");
				String rol = scan.next();
				user1.setUserRole(rol);

				boolean res = manufacturerService.modifyDealer(id, user1);
				if (res)

					log.info("Record has been updated Successfully!!!");
				else
					log.info("Record has not updated");
				break;

			case 3:

				log.info("Enter the UserId(String) You want to Delete");
				String userid = scan.next();
				dao.removeDealer(userid);
				log.info("User id is deleted Succesfully.....");
				break;

			case 4:
				log.info("Enter user id you want to see.........");
				String role = scan.next();
				List<String> li = dao.viewAllDealers(role);
				for (String s : li)
					log.info(li);
				break;

			case 5:
				ProductDetailsInfo product = new ProductDetailsInfo();
				log.info("Enter the ProductId");
				int pId = scan.nextInt();
				product.setProductId(pId);

				log.info("Enter the product name");
				String pname = scan.next();
				product.setProductName(pname);

				log.info("Enter the Price");
				double d = scan.nextDouble();
				product.setPrice(d);

				log.info("Enter the Warranty");
				Integer str = scan.nextInt();
				product.setWarranty(str);

				log.info("Enter product brand");
				String brand = scan.next();
				product.setProductBrand(brand);

				dao.addProduct(product);
				log.info("Insert Succesfully");
				break;

			case 6:
				ProductDetailsInfo inf = new ProductDetailsInfo();
				log.info("Please Enter the product id ");
	            inf.setProductId(scan.nextInt());
				dao.modifyProduct(inf);
				log.info("product id is modified succesfully");
				break;

			case 7:
				log.info("Enter the Product id you want to delete");
				int pid = scan.nextInt();
				dao.removeProduct(pid);
				log.info("User id is deleted Succesfully....");
				break;

			case 8:
				List<String> n = dao.viewAllProducts();
				for (String string : n) {
					log.info(string);
				}
				break;
			case 9:
				List<String> ki = dao.viewStore();
				for (String string : ki) {
					log.info(string);

				}
				break;
			default:
				System.out.println("Invalid Choice...");
				break;

			}
		} while (choice != 10);
	}
}
