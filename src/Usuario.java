import java.util.Scanner;

public class Usuario {

    // Atributos
    private String nombre;
    private int id_Estudiante;
    private String tipo_de_persona;
    private String ruta_asignada;
    private int saldo;

    // Constructor para crear objetos y darle valores iniciales a los objetos
    public Usuario(){
        this.nombre = nombre;
        this.id_Estudiante = id_Estudiante;
        this.tipo_de_persona = tipo_de_persona;
        this.ruta_asignada = ruta_asignada;
        this.saldo =saldo;
    }

    // Metodos
    public void mostrarDetalles(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("ID Estudiante: ");
        int id_Estudiante = entrada.nextInt();
        System.out.println("Tipo de usuario: ");
        entrada.nextLine();     //despues de nextInt queda un salto de línea en el buffer de entrada y nextLine lee ese salto de linea y no recibe una entrada
        String tipo_de_persona = entrada.nextLine();
        System.out.println("Ruta asignada: ");
        String ruta_asignada = entrada.nextLine();
        System.out.println("Saldo: $");
        int saldo = entrada.nextInt();

    }
}
