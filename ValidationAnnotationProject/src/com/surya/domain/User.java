package com.surya.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
	@NotEmpty(message="uname is required")
private String uname;
	@NotEmpty(message="uid is required")
private String uid;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}

}
