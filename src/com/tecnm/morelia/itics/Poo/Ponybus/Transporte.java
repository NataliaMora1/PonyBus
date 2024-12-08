package com.tecnm.morelia.itics.Poo.Ponybus;

import java.util.ArrayList;

public class Transporte {
    private int idTransporte;
    private String nombreConductor;
    private int capacidadMaxima = 25;
    private final int rutasDisponibles = 5;

    public Transporte() {
    }

    private ArrayList<Usuario> lista1 = new ArrayList<>();
    private ArrayList<Ruta> lista2 = new ArrayList<Ruta>();

    //metodos
    //Agregar Usuarios
    public void capacidad(Usuario nuevoUsuario, boolean agregar) {
        if (agregar) {
            if (!lista1.contains(nuevoUsuario)) {
                if (lista1.size() < capacidadMaxima) {
                    lista1.add(nuevoUsuario);
                } else {
                    System.out.println("Se alcanzó la capacidad maxima. La capacidad es de: " + capacidadMaxima + " usuarios.");
                }
            } else {
                System.out.println("Usuario repetido.");
            }
        } else {
            if (lista1.contains(nuevoUsuario)) {
                lista1.remove(nuevoUsuario);
                System.out.println("Usuario eliminado. Total de usuarios: " + lista1.size() + ".");
            } else {
                System.out.println("El usuario no esta en la lista, no se puede eliminar.");

            }
        }
    }

    //Agregar Rutas
    public void asignarRuta(Ruta nuevaRuta, boolean agregar) {
        if (agregar) {
            if (!lista2.contains(nuevaRuta)) {
                if (lista2.size() < rutasDisponibles) {
                    lista2.add(nuevaRuta);
                } else {
                    System.out.println("Se alcanzó la capacidad maxima de rutas. La capacidad es de: " + rutasDisponibles + " rutas.");
                }
            } else {
                System.out.println("Ruta ya en servicio.");
            }
        } else {
            if (lista2.contains(nuevaRuta)) {
                lista2.remove(nuevaRuta);
                System.out.println("Ruta eliminada. Total de rutas activas: " + lista2.size() + ".");
            } else {
                System.out.println("La ruta no está en servicio, no se puede eliminar.");
            }
        }
    }

    //Mostrar Rutas
    public void mostrarUsuarios() {
        for (Usuario usuario : lista1) {
            usuario.mostrarDatos();
        }
    }

    public void mostrarRutas() {
        for (Ruta ruta : lista2) {
            ruta.mostrarRutas();
        }
    }
}
