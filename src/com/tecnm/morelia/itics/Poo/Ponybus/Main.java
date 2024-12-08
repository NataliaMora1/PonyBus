package com.tecnm.morelia.itics.Poo.Ponybus;

public class Main {
    public static void main(String[] args) {



        //crear objetos de la clase Usuario
        Usuario persona1 = new Usuario("Natalia", 23120576, "Alumna", 100);
        Usuario persona2 = new Usuario("Martha", 23120646, "Alumna", 0);
        Usuario persona3 = new Usuario("Monse", 231206434, "Alumna", 30);
        Usuario persona4 = new Usuario("Richi", 231254834, "Alumno", 15);

        //crear objetos de la clase Ruta
        Ruta rutaA = new Ruta(1, "Ruta Centro", "9:00 AM");
        Ruta rutaB = new Ruta(2, "Ruta Sur", "10:00 AM");
        Ruta rutaC = new Ruta(3, "Ruta Norte", "11:00 AM");
        Ruta rutaD = new Ruta(4, "Ruta Oeste", "12:00 AM");

        //crear objeto de la clase Conductor
        Conductor conductor = new Conductor();

        //crear objetos de las listas
        Transporte listaUsuario = new Transporte();
        Transporte listaRuta = new Transporte();

        //manejo de archivos
        conductor.capturarDatos();
        conductor.guardarEnArchivo("conductor.txt");
        conductor.leerDesdeArchivo("conductor.txt");

        //agregar Usuarios
        listaUsuario.capacidad(persona1, true);
        listaUsuario.capacidad(persona2, true);
        listaUsuario.capacidad(persona3, true);

        //usuario repetido
        listaUsuario.capacidad(persona2, true);

        //eliminar usuario
        listaUsuario.capacidad(persona3, false);
        listaUsuario.capacidad(persona4, false);

        //mostrar Usuarios
        listaUsuario.mostrarUsuarios();

        //agregar Rutas
        listaRuta.asignarRuta(rutaA, true);
        listaRuta.asignarRuta(rutaB, true);
        listaRuta.asignarRuta(rutaC, true);

        //ruta en servicio(repetida)
        listaRuta.asignarRuta(rutaB, true);

        //eliminar ruta
        listaRuta.asignarRuta(rutaC, false);
        listaRuta.asignarRuta(rutaD, false);

        //mostrar Rutas
        listaRuta.mostrarRutas();
    }
}