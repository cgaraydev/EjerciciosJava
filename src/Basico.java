import javax.swing.*;
import java.util.Scanner;

public class Basico {
    public static void main(String[] args) {

//        Declarar dos variables numericas, mostrar por consola el resultado de suma, resta, multiplicacion, division y modulo
        double num1 = 11;
        double num2 = 5;
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));

//        Declarar dos variables numericas, indicar cual es el mayor o si son iguales
        int num3 = 11;
        int num4 = 14;
        if (num3 > num4) {
            System.out.println("El numero mayor es: " + num3);
        } else if (num3 < num4) {
            System.out.println("El numero mayor es: " + num4);
        } else {
            System.out.println("Los numeros son iguales");
        }

//        Declarar un string que contenga tu nombre y mostra un mensaje de bienvenida
        String nombre = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);

//        Declarar un string que contenga tu nombre y mostra un mensaje de bienvenida, Utilizar JOptionPane
        String nombreJOptionPane = JOptionPane.showInputDialog("Introduce tu nombre: ");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombreJOptionPane);

//        Leer un numero por telcado e indicar si es par o impar
        int numeroLeido = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        if (numeroLeido % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es PAR");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es IMPAR");
        }




    }
}