
class Animal {
    protected int id;
    protected String nombre;
    protected String especie;
    protected int edad;
    protected double peso;
    protected String fechaIngreso;

    public Animal(int id, String nombre, String especie, int edad, double peso, String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.fechaIngreso = fechaIngreso;
    }

    public void registrar() {
        System.out.println("Registrando animal: " + nombre);
    }

    public void actualizarFicha() {
        System.out.println("Actualizando ficha médica de " + nombre);
    }

    public void alimentar() {
        System.out.println(nombre + " está siendo alimentado.");
    }

    public void verificarSalud() {
        System.out.println("Verificando salud de " + nombre);
    }
}

// ===============================
// CLASES HIJAS DE ANIMAL
// ===============================
class Mamifero extends Animal {
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

// Subclases específicas
class Leon extends Mamifero {
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

class Elefante extends Mamifero {
    private double tamanoOrejas;
    private String capacidadMemoria;

    public Elefante(int id, String nombre, int edad, double peso, String fechaIngreso,
                    double tamanoOrejas, String capacidadMemoria) {
        super(id, nombre, "Elefante", edad, peso, fechaIngreso, "Grueso", 22, 36.8);
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
        System.out.println(nombre + " emite sonidos para comunicarse.");
    }
}

// ===============================
// REPTILES
// ===============================
class Reptil extends Animal {
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

class Cocodrilo extends Reptil {
    private int horasBajoAgua;
    private int fuerzaMordida;

    public Cocodrilo(int id, String nombre, int edad, double peso, String fechaIngreso,
                     int horasBajoAgua, int fuerzaMordida) {
        super(id, nombre, "Cocodrilo", edad, peso, fechaIngreso, "Duras", false, 70.0);
        this.horasBajoAgua = horasBajoAgua;
        this.fuerzaMordida = fuerzaMordida;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con una mordida de " + fuerzaMordida + " PSI.");
    }
}

class Iguana extends Reptil {
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

// ===============================
// CLASES DE USUARIOS
// ===============================
class Usuario {
    protected String nombre;
    protected int id;
    protected String password;

    public Usuario(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }

    public void iniciarSesion() {
        System.out.println(nombre + " ha iniciado sesión correctamente.");
    }

    public void validarUsuario() {
        System.out.println("Validando usuario " + nombre + "...");
    }
}

class Administrador extends Usuario {
    private String horarioTrabajo;

    public Administrador(String nombre, int id, String password, String horarioTrabajo) {
        super(nombre, id, password);
        this.horarioTrabajo = horarioTrabajo;
    }

    public void registrarAnimal(Animal a) {
        System.out.println(nombre + " ha registrado al animal: " + a.nombre);
    }

    public void borrarAnimal(Animal a) {
        System.out.println(nombre + " ha eliminado al animal: " + a.nombre);
    }

    public void mostrarAnimal(Animal a) {
        System.out.println("Mostrando ficha del animal: " + a.nombre + " (" + a.especie + ")");
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Administrador " + nombre + " ha iniciado sesión con permisos completos.");
    }
}

class Cuidador extends Usuario {
    private String horarioTurno;

    public Cuidador(String nombre, int id, String password, String horarioTurno) {
        super(nombre, id, password);
        this.horarioTurno = horarioTurno;
    }

    public void alimentarAnimal(Animal a) {
        System.out.println(nombre + " está alimentando a " + a.nombre);
    }

    public void actualizarDatosAnimal(Animal a) {
        System.out.println(nombre + " ha actualizado los datos del animal: " + a.nombre);
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Cuidador " + nombre + " ha iniciado sesión con permisos limitados.");
    }
}

// ===============================
// CLASE PRINCIPAL (UN SOLO MAIN)
// ===============================
public class Main {
    public static void main(String[] args) {

        // Crear animales
        Leon leon = new Leon(1, "Simba", 5, 190.5, "2023-06-12", 80.0, 9);
        Elefante elefante = new Elefante(2, "Dumbo", 10, 540.2, "2022-04-10", 1.2, "Excelente");
        Iguana iguana = new Iguana(3, "Iggy", 3, 5.4, "2024-01-05", "Verde", 0.8);
        Cocodrilo coco = new Cocodrilo(4, "Rex", 6, 220.3, "2021-09-15", 2, 3500);

        // Crear usuarios
        Administrador admin = new Administrador("Laura", 100, "admin123", "8am-4pm");
        Cuidador cuidador = new Cuidador("Carlos", 101, "cuidador456", "2pm-10pm");

        // Acciones del administrador
        admin.iniciarSesion();
        admin.registrarAnimal(leon);
        admin.registrarAnimal(elefante);
        admin.mostrarAnimal(iguana);

        System.out.println();

        // Acciones del cuidador
        cuidador.iniciarSesion();
        cuidador.alimentarAnimal(leon);
        cuidador.alimentarAnimal(iguana);
        cuidador.actualizarDatosAnimal(elefante);

        System.out.println();

        // Acciones de los animales
        leon.rugirFuerte();
        elefante.lanzarAgua();
        iguana.camuflarse();
        coco.atacar();
    }
}