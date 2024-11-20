package Figuras;


public class Cuadrado extends Figura {
    private int lado;

    //¿por qué crear un constructor sin parametros en la clase Figura?
    public Cuadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

}
