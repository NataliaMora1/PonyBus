package com.tecnm.morelia.itics.Poo.Ponybus;

import java.io.*;
import java.util.Scanner;

public class Conductor {
    private int id;
    private String nombre;
    private String apellidoP;
    private String apellidoM;

    public Conductor() {

    }

    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el Nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese el Apellido Paterno: ");
        this.apellidoP = scanner.nextLine();
        System.out.print("Ingrese el Apellido Materno: ");
        this.apellidoM = scanner.nextLine();
    }

    public void guardarEnArchivo(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("ID: " + id + "\n");
            writer.write("Nombre: " + nombre + "\n");
            writer.write("Apellido Paterno: " + apellidoP + "\n");
            writer.write("Apellido Materno: " + apellidoM + "\n");
            writer.write("---\n");
            System.out.println("Datos guardados en el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

    public void leerDesdeArchivo(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Datos de los conductores:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer los datos desde el archivo: " + e.getMessage());
        }
    }
}
