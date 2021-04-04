package com.sgtesting.poly;

abstract class GeometricFigure
{
	abstract void area();
}

class Rectangle extends GeometricFigure
{
	void area()
	{
		int l,b;
		l=12;b=5;
		System.out.println("Area of the Rectangle :"+(l*b));
	}
}

class Square extends GeometricFigure
{
	void area()
	{
		int side;
		side=5;
		System.out.println("Area of the Square :"+(side*side));
	}
}

class Circle extends GeometricFigure
{
	void area()
	{
		double pi=3.14;
		double r=2.5;
		System.out.println("Area of the Circle :"+(pi*r*r));
	}
}
public class Example {
	public static void main(String[] args) {
		GeometricFigure figure=null;
		
		Rectangle rect =new Rectangle();
		Square square=new Square();
		Circle circle=new Circle();
		
		figure=rect;
		figure.area();
		
		figure=square;
		figure.area();
		
		figure=circle;
		figure.area();
		
	}

}

