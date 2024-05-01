package ejercicio.mundopc.modelo;

public class Computador {
    private int idComputador;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int contadorComputadores;

    private Computador() {
        idComputador = ++contadorComputadores;
    }

    public Computador(String nombre, Monitor monitor, Raton raton, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computador\n" +
                " idComputador = " + idComputador + ", nombre = " + nombre +
                " monitor = " + monitor +
                ", raton = " + raton +
                ", teclado = " + teclado;
    }
}
