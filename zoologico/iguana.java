package EJER2ZOOLOGICO;

public class iguana extends Reptil {
    public String cambiarPiel;
    public double tamanoCola;

    public iguana(int id, String nombre, int edad, double peso, String fechaIngreso,
                  String cambiarPiel, double tamanoCola) {
        super(id, nombre, edad, peso, fechaIngreso, "Pequeñas", false, 50.0);
        this.cambiarPiel = cambiarPiel;
        this.tamanoCola = tamanoCola;
    }

    public void camuflarse() {
        System.out.println(nombre + " se camufló con su entorno para protegerse.");
    }

    public void mudarPiel() {
        System.out.println(nombre + " está mudando la piel. Proceso: " + cambiarPiel);
    }
}
