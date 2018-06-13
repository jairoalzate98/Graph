package views;

import javax.swing.JTextField;

public class Texts {

	private JTextField jTextField;
	private int x;
	private int y;
	
	public Texts(JTextField jTextField, int x, int y) {
		this.jTextField = jTextField;
		this.x = x;
		this.y = y;
	}

	public JTextField getjTextField() {
		return jTextField;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}