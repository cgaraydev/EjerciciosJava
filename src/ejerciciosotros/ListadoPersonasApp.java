package ejerciciosotros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        var salir = false;
        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(sc, personas);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar persona
                2. Listar personas
                3. Salir
                """
        );
        System.out.print("Ingresa una opción: ");
    }

    private static boolean ejecutarOperacion(Scanner sc, List<Persona> personas) {
        var operacion = Integer.parseInt(sc.nextLine());
        var salir = false;
        switch (operacion) {
            case 1 -> {
                System.out.println("Ingresa el nombre de la persona: ");
                var nombre = sc.nextLine();
                System.out.println("Ingresa el telefono de la persona: ");
                var tel = sc.nextLine();
                System.out.println("Ingresa el email de la persona: ");
                var email = sc.nextLine();
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene " + personas.size() + " personas");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Saliendo...");
                salir = true;
            }
            default -> System.out.println("Operación no encontrada");
        }
        return salir;
    }
}
