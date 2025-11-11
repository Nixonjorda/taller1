package EJER2ZOOLOGICO;

public class cocodrilo extends Reptil {
    public int horasBajoAgua;
    public int fuerzaMordida;

    public cocodrilo(int id, String nombre, int edad, double peso, String fechaIngreso,
                     int horasBajoAgua, int fuerzaMordida) {
        super(id, nombre, edad, peso, fechaIngreso, "grandes", false,  70.0);
        this.horasBajoAgua = horasBajoAgua;
        this.fuerzaMordida = fuerzaMordida;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con una mordida poderosa.");
    }

    public void nadarFurtivo() {
        System.out.println(nombre + " nada sigilosamente bajo el agua.");
    }

    public void acechar() {
        System.out.println(nombre + " acecha a su presa desde el agua.");
    }
}
