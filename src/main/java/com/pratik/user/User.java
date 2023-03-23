package com.pratik.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int uId;
	private String uName;
	private long pNo;
	private String eMail;
	@OneToOne
	UserPersonal userpersonal;
	
	public UserPersonal getUserpersonal() {
		return userpersonal;
	}
	public void setUserpersonal(UserPersonal userpersonal) {
		this.userpersonal = userpersonal;
	}
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public long getpNo() {
		return pNo;
	}
	public void setpNo(long pNo) {
		this.pNo = pNo;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", pNo=" + pNo + ", eMail=" + eMail + ", userpersonal="
				+ userpersonal + "]";
	}
	
	

}
