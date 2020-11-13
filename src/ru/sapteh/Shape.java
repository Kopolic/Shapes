package ru.sapteh;

public abstract class Shape{
    private String color;
    private int coordX;
    private int coordY;
    public Shape(String color, int coordX, int coordY){
    this.color = color;
    this.coordX = coordX;
    this.coordY = coordY;
    }


    public String getColor(){
        return color;
    }
    public int getCoordX(){
        return coordX;
    }
    public int getCoordY(){
        return coordY;
    }
    public abstract String draw();
    public abstract double area();
}