package Figuras;

import java.util.Scanner;

public class Triangulo {
    private int x;
    private int y;
    private double altura;
    private double base;
    private double lado;

    public Triangulo(int x, int y, double altura, double base, double lado){
        this.x = x;
        this.y = y;
        this.altura = altura;
        this.base = base;
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
    public void calcularTriangulo(){
        double area = (base * altura) / 2;
        System.out.println("Area del triangulo: " + area);
        double perimetro = lado + lado + base;
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("--------------");

    }

}
