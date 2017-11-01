package chapter22;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetWithComparator {

	public static void main(String[] args) {
		Set<GeometricObject> set = new TreeSet<GeometricObject>();
		set.add(new Rectanglel(4, 5));
		set.add(new Circle(40));
		set.add(new Circle(40));
		set.add(new Rectanglel(4, 1));
		
		System.out.println("A sorted set of geometric objects");
		for (GeometricObject element: set) {
			System.out.println("area = " + element.getArea());
		}
	}
}
