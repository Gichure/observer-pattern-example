/**
 *Paul
 *Dec 4, 2019 11:52:56 AM
 */
package com.pgichure.tutorials.patterns.observer;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import com.pgichure.tutorials.patterns.observer.controllers.LoginController;
import com.pgichure.tutorials.patterns.observer.models.User;
import com.pgichure.tutorials.patterns.observer.views.LoginView;

/**
 * @author Paul
 * The application entry class
 *
 */
public class ObserverApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
					
			@Override
			public void run() {
				runApplication();
			}
		});		
	 }

	
	
	private static void runApplication() {
		
		User user = new User();
		LoginView view = new LoginView();		
		LoginController controller = new LoginController(user, view);	
		view.setBounds(50, 100, 500, 400);
		view.setVisible(true);
		JButton button = new JButton();
		view.add(button);
	    view.setLoginListener(controller);
	}

}
