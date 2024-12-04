package com.tecnm.morelia.itics.Poo.Ponybus;

public class Usuario{
    private String nombre;
    private int id_Estudiante;
    private String tipo_De_Usuario;
    private int saldo;

    
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Id del estudiante: " + id_Estudiante);
        System.out.println("Tipo de usuario: " + tipo_De_Usuario);
        System.out.println("Saldo: " + saldo);
        System.out.println("-------------------");
    }
    public void recargarSaldo(int monto){
        if(monto>=0){
            saldo += monto;
            System.out.println("Recarga exitosa. Saldo " + saldo);
        }
        else{
            System.out.println("Monto insuficiente.");
        }

    }

}
