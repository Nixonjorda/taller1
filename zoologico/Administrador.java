package EJER2ZOOLOGICO;

public class Administrador extends Usuario {

    public Administrador(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
    }

    public void registrarCuidador() {
        System.out.println(nombre + " ha registrado un nuevo cuidador.");
    }

    public void administrarUsuarios() {
        System.out.println(nombre + " está administrando los usuarios.");
    }

    public void consultarReportes() {
        System.out.println(nombre + " consulta los reportes del zoológico.");
    }

    public void eliminarOModificar() {
        System.out.println(nombre + " elimina o modifica registros del sistema.");
    }
}
