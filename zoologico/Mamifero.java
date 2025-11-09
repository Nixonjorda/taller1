public class Mamifero extends Animal {
    protected String tipoPelo;
    protected int gestacionMeses;
    protected double temperaturaCorporal;

    public Mamifero(int id, String nombre, String especie, int edad, double peso, String fechaIngreso,
                    String tipoPelo, int gestacionMeses, double temperaturaCorporal) {
        super(id, nombre, especie, edad, peso, fechaIngreso);
        this.tipoPelo = tipoPelo;
        this.gestacionMeses = gestacionMeses;
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public void amamantar() {
        System.out.println(nombre + " está amamantando a sus crías.");
    }

    public void regularTemperatura() {
        System.out.println(nombre + " regula su temperatura corporal.");
    }

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }
}