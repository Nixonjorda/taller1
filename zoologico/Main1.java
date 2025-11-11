package EJER2ZOOLOGICO;

public class Main1 {
    public static void main(String[] args) {

        // Crear animales
        Leon leon = new Leon(1, "francisca", 5, 190.5, "2023-02-15", 80.0, 10);
        Elefante elefante = new Elefante(2, "fresca", 10, 5400, "2022-08-10", 1.5, "Excelente");
        cocodrilo coco = new cocodrilo(3, "patricio", 12, 500, "2021-03-12", 5, 2000);
        iguana iguana1 = new iguana(4, "iggy", 3, 5.5, "2024-01-05", "Verde", 0.6);

        Administrador admin = new Administrador("Carlos", "admin", "1234");
        Cuidador cuidador = new Cuidador("maria", "cuidador1", "abcd");

        cuidador.registrarAnimal(leon);
        cuidador.alimentarAnimal(leon);
        cuidador.verificarSalud(elefante);
        cuidador.actualizarFicha(iguana1);

        admin.registrarCuidador();
        admin.administrarUsuarios();
        admin.consultarReportes();
        admin.eliminarOModificar();

        leon.rugirFuerte();
        elefante.lanzarAgua();
        coco.acechar();
        iguana1.camuflarse();
    }
}
