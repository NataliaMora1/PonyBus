package com.tecnm.morelia.itics.Poo.Ponybus;

public class Ruta {
    private int id_Ruta;
    private String nombre;
    private int horario;

    public Ruta(int id_Ruta, String nombre, int horario) {
        this.id_Ruta = id_Ruta;
        this.nombre = nombre;
        this.horario = horario;
    }

    public void mostrarDatosRutas() {
        System.out.println("Id de ruta: " + id_Ruta);
        System.out.println("Nombre: " + nombre);
        System.out.println("Hora de inicio: " + horario);
        ;
        System.out.println("-------------------");
    }
}
