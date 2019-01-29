package com.naztech.model;



public class User {
	String name;
	String UserId;
	int salary;
	String country;
	String city;
	int zipCode;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}
	
    public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}


	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}





	@Override
	public String toString() {
		return "User [name=" + name + ", UserId=" + UserId + ", salary=" + salary + ", country=" + country + ", city="
				+ city + ", zipCode=" + zipCode + "]";
	}
	
	
	
	

}
