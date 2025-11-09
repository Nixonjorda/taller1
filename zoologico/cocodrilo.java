public class Cocodrilo extends Reptil {
    private int horasBajoAgua;
    private int fuerzaMordida;

    public Cocodrilo(int id, String nombre, int edad, double peso, String fechaIngreso,
                     int horasBajoAgua, int fuerzaMordida) {
        super(id, nombre, "Cocodrilo", edad, peso, fechaIngreso, "Duras", false, 70.0);
        this.horasBajoAgua = horasBajoAgua;
        this.fuerzaMordida = fuerzaMordida;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con una mordida de " + fuerzaMordida + " PSI.");
    }
}