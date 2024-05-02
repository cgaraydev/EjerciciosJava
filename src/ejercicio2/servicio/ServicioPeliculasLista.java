package ejercicio2.servicio;

import ejercicio2.dominio.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class ServicioPeliculasLista implements IServicioPeliculas {

    private final List<Pelicula> peliculas;

    public ServicioPeliculasLista() {
        this.peliculas = new ArrayList<>();
    }

    @Override
    public void listarPeliculas() {
        System.out.println("Listado de películas: ");
        peliculas.forEach(System.out::println);

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
        System.out.println("Película agregada con éxito");
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var indice = peliculas.indexOf(pelicula);
        if (indice == -1) {
            System.out.println("Película no encontrada");
        } else {
            System.out.println("Película encontrada en el índice: " + indice);
        }
    }
}
