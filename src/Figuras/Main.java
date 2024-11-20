package Figuras;

public class Main {
    public static void main(String[] args){

        Ubicacion ubicacion1 = new Ubicacion(0,0);
        Ubicacion ubicacion2 = new Ubicacion(1,2);

        //Figura figura = new Figura(true, ubicacion1);

        Cuadrado cuadrado1 = new Cuadrado(3);
        cuadrado1.mostrarUbicacion();

        cuadrado1.moverFigura(ubicacion2);
        cuadrado1.mostrarUbicacion();
        
        System.out.println("Area: " + cuadrado1.calcularArea());

    }
}
