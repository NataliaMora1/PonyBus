package Figuras;

public class Figura {
    private boolean visibilidad;
    private Ubicacion ubi;

    public Figura(boolean visibilidad, Ubicacion ubi){
        this.visibilidad = visibilidad;
        this.ubi = ubi;
    }

    public Figura(){
        this.ubi = new Ubicacion(0,0);
        //ubi.setX(0);
        //ubi.setY(0);
        visibilidad = true;
    }
    //Metodos
    public void moverFigura(Ubicacion newUbi){
        this.ubi = newUbi;
    }
    public void mostrarUbicacion(){
        System.out.println(ubi.getX()+ " " + ubi.getY());
    }
}
