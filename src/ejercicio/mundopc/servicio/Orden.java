package ejercicio.mundopc.servicio;

import ejercicio.mundopc.modelo.Computador;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    private final List<Computador> computadores;
    private static int contadorOrdenes;

    public Orden() {
        computadores = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void agregarComputador(Computador computador) {
        computadores.add(computador);
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        System.out.println("Total Computadores: " + computadores.size());
        System.out.println();
        computadores.forEach(System.out::println);
    }

}
