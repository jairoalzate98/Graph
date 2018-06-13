package models;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Node> nodeList;
	
	public Manager() {
		nodeList = new ArrayList<>();
	}
	
	public static Node createNode(String info, int posX, int posY) {
		return new Node(info, posX, posY);
	}
	
	public void addNode(Node node) {
		nodeList.add(node);
	}

	public ArrayList<Node> getNodeList() {
		return nodeList;
	}
}