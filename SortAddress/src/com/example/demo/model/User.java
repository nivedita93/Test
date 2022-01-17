package com.example.demo.model;
public class User implements Comparable<User> {
	
	String firstName;
	String lastName;
	String phoneNo;
	String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(String firstName, String lastName, String phoneNo, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	 
	 @Override
	  public int compareTo(User user) {
	   return this.firstName.compareTo(user.getFirstName());
	   
	  }
	 

		@Override
		public String toString() {
			return( firstName+" "+ lastName+" "+ phoneNo+" "+ address);
			
		}

}
