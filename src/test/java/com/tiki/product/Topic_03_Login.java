package com.tiki.product;

import org.testng.annotations.Test;

import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Topic_03_Login {
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	private static final int NUMBER = 100;
	

	@Test
	public void Login_01_Empty_Data() {
		printNumber(NUMBER);
		
		int studentNumber = 500;
		
		printNumber(studentNumber);
	}

	private void printNumber(int number) {
		for (int i = 0; i < number; i++) {
			System.out.println(i);
		}
	}

}
