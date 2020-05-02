package com.sapient.shapes;
public class Shapes {
	int numberOfSides;
	 void calculateShapeArea(int Shape, int sideLength) {
		 numberOfSides=Shape;
		 if(numberOfSides==1) {
			 Circle circle=new Circle();
			 circle.calculateArea(sideLength);
		 }
		 else if(numberOfSides==3) {
			 Triangle triangle=new Triangle();
			 triangle.calculateArea(sideLength);
		 }
		 else if(numberOfSides==4) {
			 Square square=new Square();
			 square.calculateArea(sideLength);
		 }
		 else {
			 System.out.println("No Shapes Present");
		 }
	 }
	 public static void main(String[] args) {
		 Shapes shape1= new Shapes();
		 shape1.calculateShapeArea(3,12);
		 Shapes shape2= new Shapes();
		 shape2.calculateShapeArea(4,15);
		 Shapes shape3= new Shapes();
		 shape3.calculateShapeArea(5,15);
	 }
}