package chapter22;

import java.util.Date;

public class GeometricObject implements Comparable<GeometricObject> {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	private double area;
	
	public GeometricObject() {

		dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getArea() {
		return area;
	}

	@Override
	public String toString() {
		return "created on" + dateCreated + "\ncolor: " + color + " amd filled: " + filled;
	}

	@Override
	public int compareTo(GeometricObject o) {

	        double area1 = this.getArea();
			double area2 = o.getArea();
			
			if (area1 < area2 ) {
				return -1;
			} else if (area1 == area2) {
				return 0;
			} else {
				return 1;
			}
		}
}
