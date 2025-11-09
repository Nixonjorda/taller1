// Hereda de la clase Usuario
public class Administrador extends Usuario {
    private String horarioTrabajo;

    // Constructor
    public Administrador(String nombre, int id, String password, String horarioTrabajo) {
        super(nombre, id, password); // Llamada al constructor del padre (Usuario)
        this.horarioTrabajo = horarioTrabajo;
    }

    // Métodos propios del Administrador
    public void registrarAnimal() {
        System.out.println(nombre + " ha registrado un nuevo animal.");
    }

    public void borrarAnimal() {
        System.out.println(nombre + " ha eliminado un animal del sistema.");
    }

    public void mostrarAnimal() {
        System.out.println(nombre + " está mostrando la lista de animales.");
    }
}