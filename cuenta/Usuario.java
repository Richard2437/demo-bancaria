public class Usuario extends Persona {
    private String nombreUsuario;

    public Usuario(String nombre, String apellido, String dni, String nombreUsuario) {
        super(nombre, apellido, dni);
        this.nombreUsuario = nombreUsuario;
    }

    // Getter
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Setter
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}