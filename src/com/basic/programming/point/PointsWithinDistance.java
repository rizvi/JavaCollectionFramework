package com.basic.programming.point;

import java.util.ArrayList;
import java.util.List;

/**
 * Find all points within a certain distance of another point
 * 
 * @author Rizvi
 * 
 */
public class PointsWithinDistance {

	public static void main(String[] args) {
		List<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(1, 1));
		pointList.add(new Point(3, 4));
		pointList.add(new Point(2, 3));
		pointList.add(new Point(4, 6));
		pointList.add(new Point(12, 13));
		pointList.add(new Point(15, 25));

		Point point = new Point(0, 0);
		double distance = 10.0;

		getPointsWithinDistance(pointList, point, distance);

	}

	// Go through all the points and find the ones which are within the distance
	public static List<Point> getPointsWithinDistance(List<Point> list,
			Point point, double distance) {
		List<Point> withinDistanceList = new ArrayList<Point>();
		for (Point p : list) {
			if (p.isWithinDistance(point, distance)) {
				withinDistanceList.add(p);
			}
		}

		System.out.println(String.format(
				"Points within %s of point x=%s, y = %s", distance,
				point.getX(), point.getY()));

		for (Point p : withinDistanceList) {
			System.out.println(String.format("Point x = %s, y= %s", p.getX(),
					p.getY()));
		}
		return withinDistanceList;
	}
}
