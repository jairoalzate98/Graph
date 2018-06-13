package models;

import java.util.ArrayList;

public class Manager {

	private ArrayList<Node> nodeList;
	private ArrayList<Relation> relationList;
	
	public Manager() {
		nodeList = new ArrayList<>();
		relationList = new ArrayList<>();
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
	
	public ArrayList<Relation> getRelationList() {
		return relationList;
	}

	public void createRelation(String nodeOne, String nodeTwo, String weight) {
		Node nodeO = null;
		Node nodeT = null;
		for (Node node : nodeList) {
			if (node.getInfo().equals(nodeOne)) {
				nodeO = node;
			}else {
				if (node.getInfo().equals(nodeTwo)) {
					nodeT = node;
				}
			}
		}
		relationList.add(new Relation(nodeO, nodeT, weight));
	}
}