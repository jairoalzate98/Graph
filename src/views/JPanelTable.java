package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.Controller;

public class JPanelTable extends JPanel{

	private static final long serialVersionUID = 1L;

	public JPanelTable(Controller controller, int number) {
		setBackground(Color.WHITE);
		setLayout(new GridLayout(number + 1, number + 1));
		String[][] tables = new String[number + 1][number + 1];
		int num = 1;
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j <= number; j++) {
				if (i == 0 && j != 0) {
					tables[i][j] = String.valueOf(j);
					add(new JLabel(j+"" , SwingConstants.CENTER));
				}else {
					if (i == 0 && j == 0) {
						add(new JLabel(""));
					}else {
						if (j == 0 && i != 0) {
							tables[i][j] = String.valueOf(num);
							add(new JLabel(num+"", SwingConstants.CENTER));
							num++;
						}else {
							add(new JTextField());
						}
					}
				}
			}
		}
	}
}