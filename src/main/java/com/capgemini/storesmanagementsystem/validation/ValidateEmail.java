package com.capgemini.storesmanagementsystem.validation;

import java.util.regex.Pattern;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ValidateEmail {
	static Logger log = LogManager.getLogger("User");

	public static boolean validEmail(String email) {
		String emailReg = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailReg);
		if (email == null) {
			return false;
		}
		return pat.matcher(email).matches();
	}

}
