package edu.svit.sf04java.abstraction;

public  class Square extends Shape {
	
	float side;

	public Square(float side) {
		super();
		this.side = side;
	}
	@Override
	public  float calculateArea() {
		return area=side*side;
	}

}