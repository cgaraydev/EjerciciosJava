package ejercicio2.presentacion;

import ejercicio2.dominio.Pelicula;
import ejercicio2.servicio.IServicioPeliculas;
import ejercicio2.servicio.ServicioPeliculasArchivo;
import ejercicio2.servicio.ServicioPeliculasLista;

import java.util.Scanner;

@SuppressWarnings("LanguageDetectionInspection")
public class CatalogoPeliculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var salir = false;
//        var servicioPeliculas = new ServicioPeliculasLista();
        IServicioPeliculas servicioPeliculas = new ServicioPeliculasArchivo();

//        var pelicula1 = new Pelicula("La verdad duele");
//        var pelicula2 = new Pelicula("El gran leon");
//        var pelicula3 = new Pelicula("Los vengadores");
//
//        IServicioPeliculas servicioPeliculas = new ServicioPeliculasLista();
//
//        servicioPeliculas.agregarPelicula(pelicula1);
//        servicioPeliculas.agregarPelicula(pelicula2);
//        servicioPeliculas.agregarPelicula(pelicula3);
//        servicioPeliculas.listarPeliculas();
//        servicioPeliculas.buscarPelicula(pelicula2);
//        servicioPeliculas.buscarPelicula(new Pelicula("El gran leono"));


        while (!salir) {
            try {
                mostrarMenu();
                salir = ejecutarOpciones(sc, servicioPeliculas);
            } catch (Exception e) {
                System.out.println("Ocurrio un error" + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                **** Catalogo de Películas ****
                1. Agregar película
                2. Listar películas
                3. Buscar película
                4. Salir
                Elige una opción:
                """);
    }

    private static boolean ejecutarOpciones(Scanner sc, IServicioPeliculas servicioPeliculas) {
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.println("Ingrese el nombre de la película: ");
                var nombre = sc.nextLine();
                servicioPeliculas.agregarPelicula(new Pelicula(nombre));
            }
            case 2 -> servicioPeliculas.listarPeliculas();

            case 3 -> {
                System.out.println("Ingrese el nombre de la película: ");
                var nombre = sc.nextLine();
                servicioPeliculas.buscarPelicula(new Pelicula(nombre));
            }
            case 4 -> {
                System.out.println("Saliendo...");
                return true;
            }
            default -> System.out.println("Opción inválida");
        }
        return salir;
    }
}

