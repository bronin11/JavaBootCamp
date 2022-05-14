package com.coderscampus.lesson4;

public class StringInputService {

	public void createUser(String[] input) {
		
		String username = input[0];
		String password = input[1];
		String name = input[2];
		
		System.out.println("Username = " + username);
		System.out.println("Password = " + password);
		System.out.println("Name = " + name);
	}



	public static void main(String args[]) {
		String []input = {"bronin11", "password123", "B. Riley"};
		StringInputService inputService = new StringInputService();
		inputService.createUser(input);
	}
}