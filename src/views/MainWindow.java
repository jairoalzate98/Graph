package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import controllers.Controller;
import models.Node;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelGraphs jPanelGraphs;
	private JPanelTable jPanelTable;

	public MainWindow(Controller controller, int number) {
		setTitle("Grafos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1, 2));
		jPanelGraphs = new JPanelGraphs();
		add(jPanelGraphs);
		jPanelTable = new JPanelTable(controller, number);
		add(jPanelTable);
	}
	
	public void setListPanel(ArrayList<Node> nodeList) {
		jPanelGraphs.setNodeList(nodeList);
		jPanelGraphs.revalidate();
		jPanelGraphs.repaint();
	}
}