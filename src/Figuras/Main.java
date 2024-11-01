package Figuras;

public class Main {
    public static void main(String[] args){

        Cuadrado cuadrado1 = new Cuadrado(0, 0, 6);
        Circulo circulo1 = new Circulo(0, 0, 3);
        Triangulo triangulo1 = new Triangulo(0, 0,6, 3,4);

        cuadrado1.calcularCoordenada();
        cuadrado1.calcularCuadrado();

        circulo1.calcularCoordenada();
        circulo1.calcularCirculo();

        triangulo1.calcularCoordenada();
        triangulo1.calcularTriangulo();

    }
}
