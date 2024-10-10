//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario persona1 = new Usuario("Natalia",23120576, "Alumno", "Ruta A", 100 );

        persona1.mostrarDetalles();
        persona1.recargarSaldo(50);
        persona1.usarTransporte(30);
    }
}