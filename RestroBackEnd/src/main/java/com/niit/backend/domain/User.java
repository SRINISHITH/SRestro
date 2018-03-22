package com.niit.backend.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")

public class User {
	@Id
	private String emailID;
	private String name;
	private String password;
	private Character role;
	private String registeredDate;
	private String Mobile;
	
	public String getEmailId() {
		return emailID;
	}
	public void setEmailId(String emailID) {
		this.emailID = emailID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Character getRole() {
		return role;
	}
	public void setRole(Character role) {
		this.role = role;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}

}
