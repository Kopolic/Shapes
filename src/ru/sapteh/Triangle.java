package ru.sapteh;

public class Triangle extends Shape{
    private int height;
    private int base;
    public Triangle(String color, int coordX, int coordY, int height, int base){
        super(color,coordX,coordY);
        this.height = height;
        this.base = base;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getBase(){
        return base;
    }
    public void setBase(int base){
        this.base = base;
    }
    @Override
    public double area (){
        return  height * (base / 2);
    }
    @Override
    public String draw (){
        return  "Triangle==============================";
    }
    @Override
    public String toString(){
       return  draw() + "\n" +
				String.format("Height: %d Base: %d Color: %s X: %d Y: %d Area: %.2f",getHeight() ,getBase(), super.getColor(), super.getCoordX(), super.getCoordY(), area());
    }
}