package EJER2ZOOLOGICO;

public class Cuidador extends Usuario {

    public Cuidador(String nombre, String usuario, String contrasena) {
        super(nombre, usuario, contrasena);
    }

    public void registrarAnimal(Animal a) {
        a.registrar();
    }

    public void alimentarAnimal(Animal a) {
        a.comer();
    }

    public void verificarSalud(Animal a) {
        a.verificarSalud();
    }

    public void actualizarFicha(Animal a) {
        a.actualizarregistro(a.nombre);
    }
}
