package Figuras;

public class Ubicacion {
    private int x;
    private int y;

    public Ubicacion(int x, int y){
        this.x = x;
        this.y = y;
    }
    //get --> mostrar x fuera de la clase Ubicacion
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //set --> modificar
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    String mostrarUbicacion(){
        return "(" + x + "," + y + ")";
    }
}
