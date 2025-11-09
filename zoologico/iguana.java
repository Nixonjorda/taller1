public class Iguana extends Reptil {
    private String colorPiel;
    private double tamanoCola;

    public Iguana(int id, String nombre, int edad, double peso, String fechaIngreso,
                  String colorPiel, double tamanoCola) {
        super(id, nombre, "Iguana", edad, peso, fechaIngreso, "Suaves", false, 65.0);
        this.colorPiel = colorPiel;
        this.tamanoCola = tamanoCola;
    }

    public void camuflarse() {
        System.out.println(nombre + " se camufla cambiando su color a " + colorPiel);
    }

    public void soltarCola() {
        System.out.println(nombre + " ha soltado su cola para escapar del peligro.");
    }
}