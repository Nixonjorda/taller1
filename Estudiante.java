package Semana1.script;

public class Estudiante extends Usuario {

    private String carrera;

    public Estudiante(String nombre, int id, String password, String carrera) {
        super(nombre, id, password);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void verNotas() {
        System.out.println("El estudiante está viendo sus notas...");
    }

    public void entregarTarea() {
        System.out.println("El estudiante entregó una tarea.");
    }
}
