package models;

public class Relation {

	private Node nodeOne;
	private Node nodeTwo;
	private String weight;
	
	public Relation(Node nodeOne, Node nodeTwo, String weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}

	public Node getNodeOne() {
		return nodeOne;
	}

	public Node getNodeTwo() {
		return nodeTwo;
	}

	public String getWeight() {
		return weight;
	}
}