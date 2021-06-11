package vishal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point>{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Integer getX() {
		return x;
	}
	@Override
	public int compareTo(Point p1) {
		return this.getX().compareTo(p1.getX());
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
}

class PointComparator{
	
}

public class CustomArraySort {

	public static void main(String[] args) {
		List<Point> l = new ArrayList<Point>();
		l.add(new Point(2, 3));
		l.add(new Point(-1, 4));
		l.add(new Point(9, 7));
		l.add(new Point(4, -1));
		l.add(new Point(8, -5));
		Collections.sort(l);
		System.out.println(l);
	}

}
