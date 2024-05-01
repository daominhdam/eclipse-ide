package com.tiki.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topic_05_Lombok {
	private String firstName;
	private String lastName;

	public static void main(String[] args) {
		Topic_05_Lombok topic05 = new Topic_05_Lombok();
		topic05.getFirstName();
		topic05.getLastName();
		
		topic05.setFirstName("Automation");
		topic05.setLastName("FC");

		// Edit this class on remote repository

	}


}
