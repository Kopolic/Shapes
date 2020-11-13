package ru.sapteh;

public class Square extends Shape{
	private int side;
	public Square(String color, int coordX, int coordY, int side){
		super(color,coordX,coordY);
		this.side = side;
	}
	public int getSide(){
		return side;
	}
	public void setSide(int side){
		this.side = side;
	}
	@Override
	public double area (){
		return side * side;
	}
	@Override
	public String draw (){
		return "Square==============================";
	}
	@Override
	public String toString(){
		return  draw() + "\n" +
				String.format("Side: %d Color: %s X: %d Y: %d Area: %.2f", getSide(), super.getColor(), super.getCoordX(), super.getCoordY(), area());
	}
}