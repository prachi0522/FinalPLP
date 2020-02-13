package com.capgemini.storesmanagementsystem.controller;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;
import com.capgemini.storesmanagementsystem.dao.AdminDaoImpl;
import com.capgemini.storesmanagementsystem.dto.UserDetailsInfo;
import com.capgemini.storesmanagementsystem.service.AdminService;
import com.capgemini.storesmanagementsystem.service.AdminServiceImpl;
import com.capgemini.storesmanagementsystem.validation.ValidateEmail;
import com.capgemini.storesmanagementsystem.validation.ValidateUserName;

public class AdminController {

	AdminService adminService = new AdminServiceImpl();

	AdminDaoImpl dao = new AdminDaoImpl();

	Logger log = Logger.getLogger("store");
	Scanner scan = new Scanner(System.in);

	void adminTask() {
		int choice = 0;
        log.info("Welcome to Admin's Page");
		log.info("1.Add Manufactures");
		log.info("2.Update Manufactures");
		log.info("3.Delete Manufactures");
		log.info("4.Show Manufactures");
		log.info("5.Exit");

		do {

			log.info("..........................................");
			log.info("Please ...Enter Your Choice");
			log.info("..........................................");
			choice = scan.nextInt();
			switch (choice) {

			case 1:

				UserDetailsInfo user = new UserDetailsInfo();
				log.info("Enter the UserId");
				String userId = scan.next();
				user.setUserId(userId);

				while (true) {
					log.info("Enter the UserName");
					String uname = scan.next();
					boolean flag = ValidateUserName.isStringAlphabet(uname);
					if (flag) {
						user.setUserName(uname);
						break;
					} else {
						log.info("User name is not valid");
					}
				}

				while (true) {
					log.info("Enter the Email");
					String email = scan.next();
					boolean flag1 = ValidateEmail.validEmail(email);
					if (flag1) {
						user.setEmail(email);
						break;
					} else {
						log.info("Email is invalid");
					}
				}

				log.info("Enter the Password");
				String password = scan.next();
				user.setPassword(password);

				log.info("Enter the Address");
				String Address = scan.next();
				user.setAddress(Address);

				log.info("Enter the Role");
				String role = scan.next();
				user.setUserRole(role);

				boolean u = adminService.addManufacturer(user);
				if (u)
					log.info("Inserted data Succesfully");
				break;

			case 2:
				UserDetailsInfo user1 = new UserDetailsInfo();
				log.info("Enter the User Id which you want to Update");
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

				boolean res = adminService.updateManufacturer(id, user1);
				if (res)

					log.info("Record has been updated Successfully!!!");
				else
					log.info("Record has not updated" + "please try again");
				break;

			case 3:
				log.info("Enter the User Id which  you want to delete");
				String userid = scan.next();

				boolean d = adminService.deleteManufacturer(userid);
				if (d)
					log.info("User Id is deleted Succesfully");
				else
					log.info("UserId not found");
				break;

			case 4:
				log.info("************Werlcome to -----Manufacturer's Informations***********");
				List<String> li = adminService.viewAllManufacturers();

				log.info(li);
				break;

			default:
				System.out.println("Invalid Choice...");
				break;

			}

		} while (choice != 5);
	}
}
