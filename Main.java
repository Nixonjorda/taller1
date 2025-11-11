package Semana1.script;

public class Main {
    public static void main(String[] args) {

        Usuario pepito = new Usuario("Juan", 123,"hola");
        pepito.logear();
        pepito.leerNota();

        Administrador admin = new Administrador("Admin", 1, "adminpass");
        admin.logear();
        admin.crearNota();

        Estudiante estudiante = new Estudiante("Nixon", 456, "1234", "Ingeniería de Software");
        estudiante.logear();
        estudiante.verNotas();

        Profesor profe = new Profesor("Carlos", 789, "abcd", "Matemáticas");
        profe.logear();
        profe.calificar();   
    }
}
