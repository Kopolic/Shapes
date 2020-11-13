package ru.sapteh;

public class Circle extends Shape{
	private int radius;
	public Circle( String color, int coordX, int coordY, int radius){
		super(color,coordX,coordY);
		this.radius = radius;
	}
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	@Override
	public double area (){
		return 2 * Math.PI * radius;
	}
	@Override
	public String draw (){
		return "Circle==============================";
	}
	@Override
	public String toString(){
		return  draw() + "\n" +
				String.format("Radius: %d Color: %s X: %d Y: %d Area: %.2f", getRadius(), super.getColor(), super.getCoordX(), super.getCoordY(), area());
	}
}