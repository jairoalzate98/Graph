package views;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import controllers.Controller;
import controllers.Events;

public class JpanelRight extends JPanel{

	public static final String ACCEPT_TEXT = "Accept";
	private static final long serialVersionUID = 1L;
	private JPanelTable jPanelTable;
	
	public JpanelRight(Controller controller, int number) {
		setLayout(new BorderLayout());
		jPanelTable = new JPanelTable(number);
		add(jPanelTable, BorderLayout.CENTER);
		JButton jbtnAccept = new JButton(ACCEPT_TEXT);
		jbtnAccept.setActionCommand(Events.ACCEPT.toString());
		jbtnAccept.addActionListener(controller);
		add(jbtnAccept, BorderLayout.SOUTH);
	}
	
	public ArrayList<Texts> getTexts() {
		return jPanelTable.getTexts();
	}
}