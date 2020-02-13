package com.capgemini.storesmanagementsystem.validation;

public class ValidateUserName {
	public static boolean isStringAlphabet(String uname) 
	{ 
		return ((uname != null) 
				&& (!uname.equals("")) 
				&& (uname.matches("^[a-zA-Z]*$"))); 
	}
}
