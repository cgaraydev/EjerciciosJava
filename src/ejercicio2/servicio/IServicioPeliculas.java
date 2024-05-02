package ejercicio2.servicio;

import ejercicio2.dominio.Pelicula;

public interface IServicioPeliculas {

    public void listarPeliculas();

    public void agregarPelicula(Pelicula pelicula);

    public void buscarPelicula(Pelicula pelicula);

}
