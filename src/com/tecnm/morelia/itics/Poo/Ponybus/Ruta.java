package com.tecnm.morelia.itics.Poo.Ponybus;

public class Ruta {
    private int id_Ruta;
    private String nombre;
    private String horario;


    // Constructor para inicializar la Ruta
    public Ruta(int id_Ruta, String nombre, String horario) {
        this.id_Ruta = id_Ruta;
        this.nombre = nombre;
        this.horario = horario;
    }

    //metodos
    public void mostrarRutas() {
        System.out.println("Id de ruta: " + id_Ruta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Hora de inicio: " + horario);
        System.out.println("-------------------");
    }
}
