package Figuras;

import java.util.Scanner;

public class Circulo {
    private int x;
    private int y;
    private double radio;

    public Circulo(int x, int y, double radio){
        this.x = x;
        this.y = y;
        this.radio = radio;
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
    public void calcularCirculo() {
        double area = Math.PI * Math.pow(2, radio);
        System.out.println("Area del circulo: " + area);
        double perimetro = 2 * (Math.PI) * radio;
        System.out.println("Perimetro del circulo: " + perimetro);
        System.out.println("--------------");

    }

}
