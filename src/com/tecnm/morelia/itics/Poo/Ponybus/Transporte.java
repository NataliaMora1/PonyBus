package com.tecnm.morelia.itics.Poo.Ponybus;

import java.util.ArrayList;

public class Transporte {
    private int idTransporte;
    private String nombreConductor;
    private int capacidadMaxima = 25;

    private ArrayList<Usuario> lista = new ArrayList<>();

    //metodos
    //agregar Usuarios
    public void capacidad(Usuario nuevoUsuario, boolean agregar) {
        if (agregar) {
            if (!lista.contains(nuevoUsuario)) {
                if (lista.size() < capacidadMaxima) {
                    lista.add(nuevoUsuario);
                } else {
                    System.out.println("Se alcanzó la capacidad maxima. La capacidad es de: " + capacidadMaxima + " usuarios.");
                }
            } else {
                System.out.println("Usuario repetido.");
            }
        } else {
            if (lista.contains(nuevoUsuario)) {
                lista.remove(nuevoUsuario);
                System.out.println("Usuario eliminado. Total de usuarios: " + lista.size() + ".");
            } else {
                System.out.println("El usuario no esta en la lista, no se puede eliminar.");

            }
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : lista) {
            usuario.mostrarDatos();
        }
    }
}
