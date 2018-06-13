package models;

import java.util.ArrayList;

public class Node {
	
	private String info;
	private ArrayList<Node> neighbourList;
	private int posX;
	private int posY;
	
	public Node(String info, int posX, int posY) {
		this.info = info;
		this.posX = posX;
		this.posY = posY;
		neighbourList = new ArrayList<>();
	}

	public String getInfo() {
		return info;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
	
	public void addNode(Node node) {
		neighbourList.add(node);
	}

	public ArrayList<Node> getNeighbourList() {
		return neighbourList;
	}

	@Override
	public String toString() {
		return "Node [info=" + info + ", posX=" + posX + ", posY=" + posY + "]";
	}
}