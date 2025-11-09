public class Reptil extends Animal {
    protected String tipoEscamas;
    protected boolean esVenenoso;
    protected double humedadNecesaria;

    public Reptil(int id, String nombre, String especie, int edad, double peso, String fechaIngreso,
                  String tipoEscamas, boolean esVenenoso, double humedadNecesaria) {
        super(id, nombre, especie, edad, peso, fechaIngreso);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
        this.humedadNecesaria = humedadNecesaria;
    }

    public void cambiarPiel() {
        System.out.println(nombre + " está mudando su piel.");
    }

    public void tomarSol() {
        System.out.println(nombre + " toma el sol para calentarse.");
    }

    public void ocultarse() {
        System.out.println(nombre + " se oculta entre las rocas.");
    }
}