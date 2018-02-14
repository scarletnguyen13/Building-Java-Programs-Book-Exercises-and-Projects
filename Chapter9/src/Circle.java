import java.awt.Point;

// Represents circular shapes with a has-a relationship.
 public class Circle {
	 private Point center;
	 private double radius;

	 // constructs a new circle with the given radius
	 public Circle(Point center, double radius) {
		 this.center = center;
		 this.radius = radius;
	 }

	 // returns the area of this circle
	 public double getArea() {
		 return Math.PI * radius * radius;
	 }
 }
 
 //This design presents a Circle object as a single clear 
 //abstraction and prevents awkward commingling of Circle 
 //and Point objects.
