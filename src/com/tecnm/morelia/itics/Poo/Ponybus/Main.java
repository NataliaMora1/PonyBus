package com.tecnm.morelia.itics.Poo.Ponybus;

public class Main{
    public static void main(String[] args){

        //crear objetos de la clase Usuario
        Usuario persona1 = new Usuario("Natalia",23120576,"Alumna","A",100);
        Usuario persona2 = new Usuario("Martha",23120646,"Alumna","A",0);

        //crear objeto de la clase ListaUsuario
        ListaUsuario lista1= new ListaUsuario();

        //llamar el metodo agregarUsuario
        lista1.agregarUsuario(persona1);
        lista1.agregarUsuario(persona2);

        //eliminar al nuevoUsuario(persona2)
        lista1.eliminarUsuario(persona2);

        //mostrar lista
        lista1.mostrarUsuario();

    }
}