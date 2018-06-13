package views;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import models.Node;
import models.Relation;

public class JPanelGraphs extends JPanel{

	public static final int WIDTH_AND_HEIGHT = 40;
	private static final long serialVersionUID = 1L;
	private ArrayList<Node> nodeList;
	private ArrayList<Relation> relationList;
	
	public JPanelGraphs() {
		setBackground(Color.WHITE);
		nodeList = new ArrayList<>();
		relationList = new ArrayList<>();
	}

	public void setNodeList(ArrayList<Node> nodeList) {
		this.nodeList = nodeList;
	}
	
	public void setRelationList(ArrayList<Relation> relationList) {
		this.relationList = relationList;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Node node : nodeList) {
			g.drawOval(node.getPosX(), node.getPosY(), WIDTH_AND_HEIGHT, WIDTH_AND_HEIGHT);
			g.drawString(node.getInfo(), node.getPosX() + 18, node.getPosY() + 25);
		}
		for (Relation relation : relationList) {
			g.drawLine(relation.getNodeOne().getPosX() + 20, relation.getNodeOne().getPosY() + 20, relation.getNodeTwo().getPosX() + 20, relation.getNodeTwo().getPosY() + 20);
		}
	}
}