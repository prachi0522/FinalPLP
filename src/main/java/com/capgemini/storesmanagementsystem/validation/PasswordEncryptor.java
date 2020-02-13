package com.capgemini.storesmanagementsystem.validation;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordEncryptor {
public PasswordEncryptor() {
	
}
public static String encryptPassword(String plainTextPassword) {
	return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
}
public static boolean checkPassword(String plainTextPassword,String encryptedPassword) {
	if(BCrypt.checkpw(plainTextPassword, encryptedPassword))
		return true;
	else
		return false;
}
}
