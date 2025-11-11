package EJER2ZOOLOGICO;

public class Reptil extends Animal {
    public String tipoEscamas;
    public boolean esVenenoso;
    public double temperaturaAmbiente;

    public Reptil(int id, String nombre, int edad, double peso, String fechaIngreso,
                  String tipoEscamas, boolean esVenenoso, double temperaturaAmbiente) {
        super(id, nombre, edad, peso, fechaIngreso);
        this.tipoEscamas = tipoEscamas;
        this.esVenenoso = esVenenoso;
        this.temperaturaAmbiente = temperaturaAmbiente;
    }

    public void tomarSol() {
        System.out.println(nombre + " está tomando el sol para mantener su temperatura corporal.");
    }

    public void arrastrarse() {
        System.out.println(nombre + " se está arrastrando lentamente por el suelo.");
    }
}
