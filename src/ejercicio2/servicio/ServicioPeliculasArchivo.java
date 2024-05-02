package ejercicio2.servicio;

import ejercicio2.dominio.Pelicula;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ServicioPeliculasArchivo implements IServicioPeliculas {

    private final String NOMBRE_ARCHIVO = "peliculas.txt";

    public ServicioPeliculasArchivo() {
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo existe");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo");
            }
        } catch (Exception e) {
            System.out.println("Error al abrir archivo " + e.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {

    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

    }
}
