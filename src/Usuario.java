public class Usuario {

    // Atributos
    private String nombre;
    private int id_Estudiante;
    private String tipo_de_usuario;
    private String ruta_asignada;
    private int saldo;

    // Constructor para crear objetos y darle valores iniciales a los objetos
    public Usuario(String nombre, int id_Estudiante, String tipo_de_usuario, String ruta_asignada, int saldo){
        this.nombre = nombre;
        this.id_Estudiante = id_Estudiante;
        this.tipo_de_usuario = tipo_de_usuario;
        this.ruta_asignada = ruta_asignada;
        this.saldo =saldo;
    }

    // Metodos
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("ID Estudiante: " + id_Estudiante);
        System.out.println("Tipo de usuario: " + tipo_de_usuario);
        System.out.println("Ruta asignada: " + ruta_asignada);
        System.out.println("Saldo: $" + saldo);
    }
    public void recargarSaldo(int monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Recarga exitosa. Saldo actual: $" + saldo);
        } else {
            System.out.println("Monto inválido para recargar.");
        }
    }
    public void usarTransporte(int costo) {
        if (saldo >= costo) {
            saldo -= costo;
            System.out.println("Transporte utilizado. Costo: $" + costo + ". Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
