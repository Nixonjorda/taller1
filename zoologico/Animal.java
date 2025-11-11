package EJER2ZOOLOGICO;

public class Animal {
    public int id;
    public String nombre;
    public int edad;
    public double peso;
    public String fechaIngreso;


    public Animal(int id, String nombre, int edad, double peso, String fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.fechaIngreso = fechaIngreso;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo su alimento favorito.");
    }

    public void verificarSalud() {
        System.out.println("Se revisó la salud de " + nombre + " y se encuentra en buen estado.");
    }

    public void registrar() {
        System.out.println("Se registró al animal: " + nombre + " con ID " + id);
    
    }
    public void actualizarregistro(String nombre) {
        this.nombre = nombre;
        System.out.print("se actualizo nombre: "  + this.nombre );
    }
}
