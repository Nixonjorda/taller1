package EJER2ZOOLOGICO;

public class Usuario {
    public String nombre;
    public String usuario;
    public String contrasena;

    public Usuario(String nombre, String usuario, String contrasena) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión.");
    }
}
