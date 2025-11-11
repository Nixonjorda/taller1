package EJER2ZOOLOGICO;

public class Elefante extends Mamifero {
    public double tamanoOrejas;
    public String capacidadMemoria;

    public Elefante(int id, String nombre, int edad, double peso, String fechaIngreso,
                    double tamanoOrejas, String capacidadMemoria) {
        super(id, nombre, "Elefante", edad, peso, fechaIngreso, "Grueso", 22, 36.5);
        this.tamanoOrejas = tamanoOrejas;
        this.capacidadMemoria = capacidadMemoria;
    }

    public void lanzarAgua() {
        System.out.println(nombre + " lanza agua con su trompa.");
    }

    public void moverTroncos() {
        System.out.println(nombre + " mueve troncos con fuerza.");
    }

    public void comunicarse() {
        System.out.println(nombre + " se comunica con sonidos graves.");
    }
}
