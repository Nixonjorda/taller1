package EJER2ZOOLOGICO;

public class Leon extends Mamifero {
    public double velocidadMax;
    public int nivelDominancia;

    public Leon(int id, String nombre, int edad, double peso, String fechaIngreso,
                double velocidadMax, int nivelDominancia) {
        super(id, nombre, "León", edad, peso, fechaIngreso, "Corto", 4, 38.0);
        this.velocidadMax = velocidadMax;
        this.nivelDominancia = nivelDominancia;
    }

    public void rugirFuerte() {
        System.out.println(nombre + " ruge fuertemente.");
    }

    public void cazarPresas() {
        System.out.println(nombre + " está cazando presas.");
    }
}
