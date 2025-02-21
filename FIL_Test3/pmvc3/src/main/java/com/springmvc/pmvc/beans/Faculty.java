/**
 * 
 */
package com.springmvc.pmvc.beans;

/**
 * 
 */
public class Faculty {
	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param pass
	 * @param mobile
	 */
	public Faculty(int id, String name, String email, String pass, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mobile = mobile;
	}
	int id;
	String name;
	String email;
	String pass;
	String mobile;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", email=" + email + ", pass=" + pass + ", mobile=" + mobile
				+ "]";
	}

}
