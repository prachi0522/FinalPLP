package com.capgemini.storesmanagementsystem.controller;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import com.capgemini.storesmanagementsystem.service.AdminServiceImpl;
import com.capgemini.storesmanagementsystem.validation.PasswordEncryptor;

public class StoresInfoController {
	static Logger log = Logger.getLogger("store");
    
	public static void main(String[] args) {
		//PasswordEncryptor p1 = new PasswordEncryptor();
		BasicConfigurator.configure();
		AdminServiceImpl service = new AdminServiceImpl();

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		log.info("1.Admin");
		log.info("2.Manufacturer");
		log.info("3.Dealer");
		log.info("4.Exit");

		int count = 0;

		do {
			log.info("...................................");
			log.info("Enter Your Choice");
			log.info("...................................");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				if (count < 1) {
					count++;
					while (true) {
						log.info("Enter your id");
						String id = sc.next();
						log.info("Enter Your Username:");
						String name = sc.next();
						log.info("Enter Your Password:");
						String password = sc.next();
                                                 	 
						boolean b = service.passwordValidate(password);
						if (b) {
							service.loginAdmin(name, password, id);
							
							String p=PasswordEncryptor.encryptPassword(password);
	                         
	                       // boolean result = PasswordEncryptor.checkPassword(password, p);
	                        log.info(p); 

                            
							log.info("SuccessFully Login");
							break;
						} else {
							log.info("Invalid credentials");

						}
						
						
					}
				}

				AdminController admin = new AdminController();
				admin.adminTask();

				break;

			case 2:
//				if (count < 1) {
//					count++;
//					while(true) {
//					log.info("Enter your id");
//					String id=sc.next();
//					log.info("Enter Your Username:");
//					String name = sc.next();
//					log.info("Enter Your Password:");
//					String password = sc.next();
//					
//					boolean b=service1.passwordValidate(password);
//					if(b) {
//						service1.loginManufacturer(name, password, id);
//						
//						log.info("successFully Login");
//						break;
//					}else {
//						log.info("invalid");
//						
//					}
//				}
//			}

				ManufacturerController manufacturer = new ManufacturerController();
				manufacturer.manufacturerTask();
				break;

			case 3:
//				if (count < 1) {
//					count++;
//					while(true) {
//					log.info("Enter your id");
//					String id=sc.next();
//					log.info("Enter Your Username:");
//					String name = sc.next();
//					log.info("Enter Your Password:");
//					String password = sc.next();
//					
//					boolean b=service2.passwordValidate(password);
//					if(b) {
//						service2.loginDealer(name, password, id);
//						
//						log.info("successFully Login");
//						break;
//					}else {
//						log.info("invalid");
//						
//					}
//				}
//			}

				DealerController dealer = new DealerController();
				dealer.dealerTask();
				break;

			}
		} while (choice != 4);

		log.trace("************ThankYou for using our stores******!!!!!!");
		sc.close();

	}

}
