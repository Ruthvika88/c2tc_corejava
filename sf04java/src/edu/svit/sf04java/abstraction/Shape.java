package edu.svit.sf04java.abstraction;

public abstract class Shape {
	
	float area;
	
	public abstract float calculateArea() ;
	
	public void display() {
		System.out.println("area of the shape:"+area);
	}
		
	

}