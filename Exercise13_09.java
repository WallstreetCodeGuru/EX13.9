public class Exercise13_09 {
    /** Main method */
	public static void main(String[] args) {
		// Create three Circle objects
		Circle circle1 = new Circle(5);
		Circle circle2 = new Circle(5);
		Circle circle3 = new Circle(4);

		// Display results
		System.out.println("Circle1 radius: " + circle1.getRadius());
		System.out.println("Circle2 radius: " + circle2.getRadius());
		System.out.println("Circle3 radius: " + circle3.getRadius());

		System.out.println("Circle1 is " + (circle1.equals(circle2) ? "" : "not ") +
			"equal to circle2");

		System.out.println("Circle1 is " + (circle1.equals(circle3) ? "" : "not ") +
			"equal to circle3");
	}
}
