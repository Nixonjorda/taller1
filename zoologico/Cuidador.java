// Hereda de Usuario
public class Administrador extends Usuario {
    private String horarioTrabajo;

    // Constructor
    public Administrador(String nombre, int id, String password, String horarioTrabajo) {
        super(nombre, id, password); // Llama al constructor de Usuario
        this.horarioTrabajo = horarioTrabajo;
    }

    // Métodos propios
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