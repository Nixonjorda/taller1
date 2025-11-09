public class Leon extends Mamifero {
    private double velocidadMax;
    private int nivelDominancia;

    public Leon(int id, String nombre, int edad, double peso, String fechaIngreso,
                double velocidadMax, int nivelDominancia) {
        super(id, nombre, "León", edad, peso, fechaIngreso, "Corto", 4, 38.5);
        this.velocidadMax = velocidadMax;
        this.nivelDominancia = nivelDominancia;
    }

    public void rugirFuerte() {
        System.out.println(nombre + " ruge con fuerza para marcar su territorio.");
    }

    public void cazarPresas() {
        System.out.println(nombre + " está cazando una presa.");
    }
}