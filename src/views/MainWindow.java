package views;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

import controllers.Controller;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelGraphs jPanelGraphs;
	private JPanelTable jPanelTable;

	public MainWindow(Controller controller) {
		setTitle("Grafos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1, 2));
		jPanelGraphs = new JPanelGraphs();
		add(jPanelGraphs);
		jPanelTable = new JPanelTable(controller);
		add(jPanelTable);
	}
}