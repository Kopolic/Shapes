package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Initialize Triangle");
        System.out.println("input height: ");
        int heightTriangle = Integer.parseInt(reader.readLine());
        System.out.println("input base: ");
        int baseTriangle = Integer.parseInt(reader.readLine());
        System.out.println("select color: ");
        String colorTriangle = reader.readLine();
        System.out.println("input coordX: ");
        int coordXTriangle = Integer.parseInt(reader.readLine());
        System.out.println("input coordY: ");
        int coordYTriangle = Integer.parseInt(reader.readLine());
		
		System.out.println("Initialize Circle");
        System.out.println("input radius: ");
        int radiusCircle = Integer.parseInt(reader.readLine());
        System.out.println("select color: ");
        String colorCircle = reader.readLine();
        System.out.println("input coordX: ");
        int coordXCircle = Integer.parseInt(reader.readLine());
        System.out.println("input coordY: ");
        int coordYCircle = Integer.parseInt(reader.readLine());
		
		System.out.println("Initialize Square");
		System.out.println("input side: ");
        int sideSquare = Integer.parseInt(reader.readLine());
        System.out.println("select color: ");
        String colorSquare = reader.readLine();
        System.out.println("input coordX: ");
        int coordXSquare = Integer.parseInt(reader.readLine());
        System.out.println("input coordY: ");
        int coordYSquare = Integer.parseInt(reader.readLine());

        Shape triangle =  new Triangle(colorTriangle, coordXTriangle, coordYTriangle, heightTriangle, baseTriangle);
        System.out.println(triangle);
		System.out.println();
		System.out.println();
		Shape circle =  new Circle(colorCircle, coordXCircle, coordYCircle, radiusCircle);
        System.out.println(circle);
		System.out.println();
		System.out.println();
		Shape square = new Square(colorSquare, coordXSquare, coordYSquare, sideSquare);
		System.out.println(square);
    }
}