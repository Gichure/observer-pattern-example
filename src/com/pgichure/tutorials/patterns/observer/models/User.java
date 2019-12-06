/**
 *Paul
 *Dec 4, 2019 11:31:12 AM
 */
package com.pgichure.tutorials.patterns.observer.models;

/**
 * @author Paul
 *
 */
public class User {
	
	private String username;
	
	private String email;
	
	

	/**
	 * 
	 */
	public User() {
		
	}

	/**
	 * @param username
	 * @param email
	 */
	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
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

}
