package com.tecnm.morelia.itics.Poo.Ponybus;

import java.util.ArrayList;

public class Conductor {
    private int salario;
    private final int rutasDisponibles = 5;

    private ArrayList<Ruta> lista = new ArrayList<Ruta>();

    //metodos
    //agregar Rutas
    public void asignarRuta(Ruta nuevaRuta, boolean agregar) {
        if (agregar) {
            if (!lista.contains(nuevaRuta)) {
                if (lista.size() < rutasDisponibles) {
                    lista.add(nuevaRuta);
                } else {
                    System.out.println("Se alcanzó la capacidad maxima de rutas. La capacidad es de: " + rutasDisponibles + " rutas.");
                }
            } else {
                System.out.println("Ruta ya en servicio.");
            }
        } else {
            if (lista.contains(nuevaRuta)) {
                lista.remove(nuevaRuta);
                System.out.println("Ruta eliminada. Total de rutas activas: " + lista.size() + ".");
            } else {
                System.out.println("La ruta no está en servicio, no se puede eliminar.");

            }
        }
    }

    public void mostrarRutas() {
        for (Ruta ruta : lista) {
            ruta.mostrarDatosRutas();
        }
    }

}
