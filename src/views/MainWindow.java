package views;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import controllers.Controller;
import models.Node;
import models.Relation;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanelGraphs jPanelGraphs;
	private JpanelRight jpanelRight;

	public MainWindow(Controller controller, int number) {
		setTitle("Grafos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setBackground(Color.WHITE);
		setLayout(new GridLayout(1, 2));
		jPanelGraphs = new JPanelGraphs();
		add(jPanelGraphs);
		jpanelRight = new JpanelRight(controller, number);
		add(jpanelRight);
	}
	
	public void setListPanel(ArrayList<Node> nodeList) {
		jPanelGraphs.removeAll();
		jPanelGraphs.setNodeList(nodeList);
		jPanelGraphs.revalidate();
		jPanelGraphs.repaint();
	}
	
	public void setRelationPanel(ArrayList<Relation> relationList) {
		jPanelGraphs.removeAll();
		jPanelGraphs.setRelationList(relationList);
		jPanelGraphs.revalidate();
		jPanelGraphs.repaint();
	}
	
	public ArrayList<Texts> getTexts() {
		return jpanelRight.getTexts();
	}
}