package ejercicio2.servicio;

import ejercicio2.dominio.Pelicula;

import java.io.*;

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
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            System.out.println("Listado de películas: ");
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = entrada.readLine();
            while (linea != null) {
                var pelicula = new Pelicula(linea);
                System.out.println(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al abrir archivo " + e.getMessage());
        }
    }

    @Override
    public void agregarPelicula(Pelicula pelicula) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            if (archivo.exists()) {
                anexar = true;
                var salida = new PrintWriter(new FileWriter(archivo, anexar));
                salida.println(pelicula);
                salida.close();
                System.out.println("Película agregada con éxito");
            }
        } catch (Exception e) {
            System.out.println("Error al abrir archivo " + e.getMessage());
        }
    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String lineaTexto = entrada.readLine();
            var indice = 1;
            var encontrada = false;
            var peliculaBuscar = pelicula.getNombre();
            while (lineaTexto != null) {
                if (peliculaBuscar != null && peliculaBuscar.equalsIgnoreCase(lineaTexto)) {
                    encontrada = true;
                    break;
                }
                lineaTexto = entrada.readLine();
                indice++;
            }
            if (encontrada) {
                System.out.println("Pelicula " + lineaTexto + "encontrada en el indice " + indice);
            } else {
                System.out.println("Película " + lineaTexto + "no encontrada");
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al abrir archivo " + e.getMessage());
        }
    }
}
