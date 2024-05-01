package ejercicio.mundopc.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private int pulgadas;
    private static int contadorMonitores;

    private Monitor() {
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, int pulgadas) {
        this();
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", pulgadas=" + pulgadas +
                '}';
    }
}