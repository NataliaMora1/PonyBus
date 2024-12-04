package com.tecnm.morelia.itics.Poo.Ponybus;
import java.util.ArrayList;

public class ListaUsuario {

    /;
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
