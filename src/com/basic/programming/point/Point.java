package com.basic.programming.point;

/**
 * Set up a class to represent point, this provides an encapsulation which holds
 * the X and Y coordinates.
 * 
 * @author Rizvi
 * 
 */
public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// It holds the helper methods to calculate distance from another point
	public double getDistance(Point otherPoint) {
		return Math.sqrt(Math.pow(otherPoint.x - x, 2)
				+ Math.pow(otherPoint.y - y, 2));
	}

	// Use a few shortcuts when calculating whether the point is within a
	// certain distance, if the point exceeds the distance on any one of the
	// axis, it means it will not be in range. So we can return false right away
	public boolean isWithinDistance(Point otherPoint, double distance) {
		if (Math.abs(otherPoint.x - x) > distance
				|| (otherPoint.y - y) > distance) {
			return false;
		}
		return getDistance(otherPoint) <= distance;
	}
}
