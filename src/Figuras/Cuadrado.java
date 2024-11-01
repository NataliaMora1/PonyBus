package Figuras;

import java.util.Scanner;

public class Cuadrado {
    private int x;
    private int y;
    private double lado;

    public Cuadrado(int x, int y, double lado){
        this.x = x;
        this.y = y;
        this.lado = lado;
    }
    public void calcularCoordenada(){
        Scanner leer = new Scanner(System.in);
        System.out.println("El cuadrado está en la coordenada: " + "(" + x + "," + y + ")");
        System.out.println("Ingresa la coordenada en x:");
        x = leer.nextInt();
        System.out.println("Ingresa la coordenada en y:");
        y = leer.nextInt();
        System.out.println("El cuadrado está en la coordenada: " + "(" + x + "," + y + ")");

    }
    public void calcularCuadrado(){
        double area = lado * lado;
        System.out.println("Area del cuadrado: " + area);
        double perimetro = lado * 4;
        System.out.println("Perimetro del cuadrado: " + perimetro);
        System.out.println("--------------");
    }
}
