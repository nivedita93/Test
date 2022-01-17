package com.example.demo.model.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.example.demo.model.User;

public class SortAddressBook {
	
	public static void main(String[] args) {
		List<User> myUsers = Arrays.asList(new User("Aleena", "M","123","Bangalore" ),
				new User("Nivedita", "Mahajan","123","Mumbai"),
				new User("Catalina", "George","123","Mumbai"));
		Collections.sort(myUsers);
		myUsers.forEach((s)->System.out.println(s));

}
}
