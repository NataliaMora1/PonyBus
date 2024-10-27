package com.tecnm.morelia.itics.Poo.Ponybus;

import java.util.ArrayList;

public class ListaRuta {

    private ArrayList<Ruta> lista = new ArrayList<Ruta>();

    public void agregarRuta(Ruta nuevaRuta){
        lista.add(nuevaRuta);
    }
    public void mostrarRutas(){
        for(Ruta ruta : lista){
            ruta.mostrarDatosRutas();
        }
    }
}
