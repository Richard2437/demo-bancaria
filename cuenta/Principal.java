public class Principal {
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario1 = new Usuario("Juan", "Perez", "12345678", "jperez");

        // Crear cuenta
        CuentaCorriente cuenta1 = new CuentaCorriente("001-123", 1000.0, usuario1);

        // Mostrar información
        cuenta1.mostrarInfo();
        System.out.println();

        // Depositar
        System.out.println("Depositando $500...");
        cuenta1.depositar(500);
        cuenta1.mostrarInfo();
        System.out.println();

        // Retirar
        System.out.println("Retirando $200...");
        cuenta1.retirar(200);
        cuenta1.mostrarInfo();
    }
}