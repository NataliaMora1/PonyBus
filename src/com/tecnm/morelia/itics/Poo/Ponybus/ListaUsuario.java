package com.tecnm.morelia.itics.Poo.Ponybus;
import java.util.ArrayList;

public class ListaUsuario {

    //crear un arraylist de tipo Usuario
    private ArrayList<Usuario> lista = new ArrayList<>();

    //agregar usuario
    public void agregarUsuario(Usuario nuevoUsuario){
        lista.add(nuevoUsuario);
    }
    //eliminar usuario
    public void eliminarUsuario(Usuario eliminarUsuario){
        lista.remove(eliminarUsuario);
    }
    //mostrar lista
    public void mostrarUsuarios(){
        for (Usuario usuario : lista) {
            usuario.mostrarDatos();
        }
    }
}
