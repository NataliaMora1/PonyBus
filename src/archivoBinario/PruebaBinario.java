package archivoBinario;

import java.io.*;

public class PruebaBinario {

    //Escribir en archivo binario
    private void escribirBinario() {
        try {
            FileOutputStream archivo = new FileOutputStream("usuarios.bin");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            escritura.writeObject(new Usuario("Natalia", 23120576));
            escritura.writeObject(new Usuario("Richi", 23120657));
            escritura.writeObject(new Usuario("Juan", 2312053));
            System.out.println("Objeto añadido con exito:)");
            escritura.close();


        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }

    //leer contenido de un archivo binario
    private void leerBinario() throws ClassNotFoundException {
        Usuario usuario;
        try {
            FileInputStream archivo = new FileInputStream("usuarios.bin");
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true) {
                usuario = (Usuario) lectura.readObject();
                usuario.mostrarDatos();
            }

        } catch (EOFException exception) {
            return;
        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }
    private void añadirBinario(){
        try {
            FileOutputStream archivo = new FileOutputStream("usuarios.bin", true);
            AñadirContenido escritura = new AñadirContenido(archivo);

            escritura.writeObject(new Usuario("Natalia", 23120576));
            escritura.writeObject(new Usuario("Richi", 23120657));
            escritura.writeObject(new Usuario("Juan", 2312053));

            System.out.println("Objeto añadido con exito:)");
            System.out.println("");
            escritura.close();


        } catch (IOException error) {
            error.printStackTrace(System.out);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        PruebaBinario prueba = new PruebaBinario();
        prueba.escribirBinario();
        prueba.añadirBinario();
        prueba.leerBinario();

    }
}
