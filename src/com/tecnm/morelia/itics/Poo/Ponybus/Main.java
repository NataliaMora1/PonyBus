package com.tecnm.morelia.itics.Poo.Ponybus;
public class Main{
    public static void main(String[] args){

        //crear objetos de la clase Usuario
        Usuario persona1 = new Usuario("Natalia",23120576,"Alumna",100);
        Usuario persona2 = new Usuario("Martha",23120646,"Alumna",0);

        Ruta rutaA = new Ruta(1, "Ruta Centro", "10:00", "11:00");
        Ruta rutaB = new Ruta(2, "Ruta Sur", "12:00", "1:00");

        //crear objeto de la clase ListaUsuario
        ListaUsuario lista1 = new ListaUsuario();

        ListaRuta lista2 = new ListaRuta();

        //llamar el metodo agregarUsuario
        lista1.agregarUsuario(persona1);
        lista1.agregarUsuario(persona2);

        lista2.agregarRuta(rutaA);
        lista2.agregarRuta(rutaB);

        //mostrar lista
        lista1.mostrarUsuarios();
        lista2.mostrarRutas();

    }
}
