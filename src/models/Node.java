package models;

public class Node {
	
	private String info;
	private int posX;
	private int posY;
	
	public Node(String info, int posX, int posY) {
		this.info = info;
		this.posX = posX;
		this.posY = posY;
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

	@Override
	public String toString() {
		return "Node [info=" + info + ", posX=" + posX + ", posY=" + posY + "]";
	}
}