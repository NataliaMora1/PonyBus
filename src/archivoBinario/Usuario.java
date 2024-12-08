package archivoBinario;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nombre;
    private int id_Estudiante;

    public Usuario(String nombre, int id_Estudiante){
        this.nombre = nombre;
        this.id_Estudiante = id_Estudiante;
    }
    //get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId_Estudiante(){
        return id_Estudiante;
    }
    public void setId_Estudiante(int id_Estudiante){
        this.id_Estudiante = id_Estudiante;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Id estudiante: " + id_Estudiante);
        System.out.println("");
    }

}
