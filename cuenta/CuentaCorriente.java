public class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;
    private Usuario titular;

    public CuentaCorriente(String numeroCuenta, double saldo, Usuario titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Usuario getTitular() {
        return titular;
    }

    // Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(Usuario titular) {
        this.titular = titular;
    }

    // Métodos
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    public void retirar(double monto) {
        setSaldo(getSaldo() - monto);
    }

    public void mostrarInfo() {
        System.out.println("Cuenta: " + getNumeroCuenta());
        System.out.println("Titular: " + getTitular().getNombre());
        System.out.println("Saldo: $" + getSaldo());
    }
}