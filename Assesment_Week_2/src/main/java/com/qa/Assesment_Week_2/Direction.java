package com.qa.Assesment_Week_2;

public class Direction {

	private int xPosition;
	private int yPosition;

	public Direction(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;

	}

	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public int getxPosition() {
		return xPosition;
	}

	public int getyPosition() {
		return yPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

}
