package Semana1.script;

public class Profesor extends Usuario {

    private String materia;

    public Profesor(String nombre, int id, String password, String materia) {
        super(nombre, id, password);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void calificar() {
        System.out.println("El profesor está calificando una tarea...");
    }

    public void crearGuia() {
        System.out.println("El profesor creó una nueva guía de estudio.");
    }
}
