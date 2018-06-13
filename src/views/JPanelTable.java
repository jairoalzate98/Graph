package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JPanelTable extends JPanel{

	private static final long serialVersionUID = 1L;
	private ArrayList<Texts> texts;

	public JPanelTable(int number) {
		texts = new ArrayList<>();
		setBackground(Color.WHITE);
		setLayout(new GridLayout(number + 1, number + 1));
		String[][] tables = new String[number + 1][number + 1];
		int num = 1;
		for (int i = 0; i <= number; i++) {
			for (int j = 0; j <= number; j++) {
				num = paintData(tables, num, i, j);
			}
		}
	}

	private int paintData(String[][] tables, int num, int i, int j) {
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
					JTextField text = new JTextField();
					texts.add(new Texts(text, i, j));
					add(text);
				}
			}
		}
		return num;
	}

	public ArrayList<Texts> getTexts() {
		return texts;
	}
}