package com.tecnm.morelia.itics.Poo.Ponybus;

public class Ruta {
    private int id_Ruta;
    private String nombre;
    private String horaInicio;
    private String horaFin;

    public Ruta(int id_Ruta, String nombre, String horaInicio, String horaFin){
        this.id_Ruta = id_Ruta;
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    public void mostrarDatosRutas(){
        System.out.println("Id de ruta: " + id_Ruta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Hora de inicio: " + horaInicio);
        System.out.println("Hora de fin: " + horaFin);
        System.out.println("-------------------");
    }
}
