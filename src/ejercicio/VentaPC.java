package ejercicio;

import ejercicio.mundopc.modelo.Computador;
import ejercicio.mundopc.modelo.Monitor;
import ejercicio.mundopc.modelo.Raton;
import ejercicio.mundopc.modelo.Teclado;
import ejercicio.mundopc.servicio.Orden;

public class VentaPC {
    public static void main(String[] args) {

        Computador computador = new Computador("HP",
                new Monitor("Samsung", 15),
                new Raton("USB", "Logitech"),
                new Teclado("USB", "Logitech"));

//        System.out.println(computador);

        Computador computador2 = new Computador("Dell",
                new Monitor("Samsung", 15),
                new Raton("Bluetooth", "Dell"),
                new Teclado("Bluetooth", "Dell"));

        Orden orden1 = new Orden();
        orden1.agregarComputador(computador);
        orden1.agregarComputador(computador2);
        orden1.mostrarOrden();

        Computador computador3 = new Computador("Mac",
                new Monitor("Apple", 15),
                new Raton("Bluetooth", "Apple"),
                new Teclado("Bluetooth", "Apple"));

        Orden orden2 = new Orden();
        orden2.agregarComputador(computador);
        orden2.agregarComputador(computador3);
        orden2.agregarComputador(computador2);
        System.out.println();
        orden2.mostrarOrden();


    }
}
