/**
 *Paul
 *Dec 4, 2019 11:32:15 AM
 */
package com.pgichure.tutorials.patterns.observer.views;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.pgichure.tutorials.patterns.observer.controllers.LoginController;
import com.pgichure.tutorials.patterns.observer.controllers.LoginListener;
import com.pgichure.tutorials.patterns.observer.models.User;

/**
 * @author Paul
 * The subject in this example
 */
public class LoginView extends JFrame{
	
	private LoginListener loginListener;
	
	private User user;
	
	private JTextField nameTextField;
	
	private JTextField emailTextField;
	
	private JButton okButton;
	
	
	/**
	 * @param user
	 * @throws HeadlessException
	 */
	public LoginView(User user) throws HeadlessException {
		super();
		this.user = user;
	}

	/**
	 * @param controller
	 */
	public void setLoginListener(LoginController listener) {
		this.loginListener = listener;
		
	}
	
	public void loginActionPerformed() {
		if(loginListener != null) {
			loginListener.loginPerformed();
		}
	}


}
