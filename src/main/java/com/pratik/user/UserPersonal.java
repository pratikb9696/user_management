package com.pratik.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserPersonal {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long uPId;
	 private String firstName;
	  private String middleName;
	  private String lastName;
	  private String FullName;
	  private String dateOfBirth;
	  private String Gender;
	  private long adharId;
	public long getuPId() {
		return uPId;
	}
	public void setuPId(long uPId) {
		this.uPId = uPId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public long getAdharId() {
		return adharId;
	}
	public void setAdharId(long adharId) {
		this.adharId = adharId;
	}
	@Override
	public String toString() {
		return "UserPersonal [uPId=" + uPId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", FullName=" + FullName + ", dateOfBirth=" + dateOfBirth + ", Gender=" + Gender
				+ ", adharId=" + adharId + "]";
	}
	  
	  
}
