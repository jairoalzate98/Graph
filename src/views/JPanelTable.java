package views;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import controllers.Controller;

public class JPanelTable extends JPanel{

	private static final long serialVersionUID = 1L;

	public JPanelTable(Controller controller, int number) {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(number + 1, number + 1));
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				
			}
		}
	}
}