
// Solution to Question 1

class Shape{
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Shape of color : \"" + color + "\"";
	}
	
	public double getArea() {
		System.out.println("Shape must be known else area cannot be calculated");;
		return 0;
	}
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle of length : " + length + " and width : " + width + ", subclass of " + super.toString();
	}
	
	@Override
	public double getArea() {
		return length * width;
	}
	
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Triangle of base : " + base + " and height : " + height + ", subclass of " + super.toString();
	}
	
	@Override
	public double getArea() {
		return 0.5 * base * height;
	}
}

//An example to test Superclass Shape and its subclasses Rectangle and Triangle

public class Q1 {

	public static void main(String[] args) {
		Shape r1 = new Rectangle("black", 10, 6); //Upcasting
		System.out.println(r1);
		System.out.println("The Area of the Rectangle is : " + r1.getArea());
		
		Shape t1 = new Triangle("Red", 5, 12);
		System.out.println(t1);
		System.out.println("The Area of the Triangle is : " + t1.getArea());
		

	}

}
