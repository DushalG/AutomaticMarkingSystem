package ams;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayButtonListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		new LoginScreen();
		

	}

}
