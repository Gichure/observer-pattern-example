/**
 *Paul
 *Dec 4, 2019 11:31:52 AM
 */
package com.pgichure.tutorials.patterns.observer.controllers;

import com.pgichure.tutorials.patterns.observer.models.User;
import com.pgichure.tutorials.patterns.observer.views.LoginView;

/**
 * @author Paul
 * Serves as the listener.. Observes the @LoginView
 */
public class LoginController implements LoginListener{
	
	private User user;
	
	private LoginView view;
	
	
	
	/**
	 * 
	 */
	public LoginController() {
		
	}


	/**
	 * @param @User user
	 * @param @LoginView view
	 */
	public LoginController(User user, LoginView view) {
		this.user = user;
		this.view = view;
	}

	
	@Override
	public void loginPerformed() {
		System.out.println("Login action performed.");
	}

}
