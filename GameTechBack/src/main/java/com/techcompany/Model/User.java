package com.techcompany.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User {

	private String uname, ufname, ulname, password, uemail, uadd, uphone, role;

	@Id
	@GeneratedValue
	int uid;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUfname() {
		return ufname;
	}

	public void setUfname(String ufname) {
		this.ufname = ufname;
	}

	public String getUlname() {
		return ulname;
	}

	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUadd() {
		return uadd;
	}

	public void setUadd(String uadd) {
		this.uadd = uadd;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
