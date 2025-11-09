public class Usuario {
    protected String nombre;
    protected int id;
    protected String password;

    // Constructor
    public Usuario(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }

    // Métodos comunes
    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión correctamente.");
    }

    public void validarUsuario() {
        System.out.println("Validando credenciales del usuario " + nombre + "...");
    }
}