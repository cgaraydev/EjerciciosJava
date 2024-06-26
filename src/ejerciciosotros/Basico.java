package ejerciciosotros;

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


//        Sumar desde el 1 hasta el numero que indiquemos
        int numeroParaSumar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        int suma = 0;
        for (int i = 1; i <= numeroParaSumar; i++) {
            suma += i;
        }
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);


//        Leer un numero por teclado y mostrar su caracter en ASCII
        int numeroParaLeer = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        char caracter = (char) numeroParaLeer;
        JOptionPane.showMessageDialog(null, "El caracter en ASCII es: " + caracter);


//        Calcular sueldo de usuario, solicitar cantidad de horas y mostrar su sueldo a 15 dolares la hora
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas: "));
        double sueldo = horas * 15;
        JOptionPane.showMessageDialog(null, "Su sueldo es: " + sueldo + " dolares");


//        Leer un numero por teclado que pida el precio de un producto y calcule el precio con iva
        int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio: "));
        double iva = (numeroPedido * 0.21) + numeroPedido;
        JOptionPane.showMessageDialog(null, "El precio con iva es: " + iva);


//        Mostrar numeros 1 al 100 incluidos con while y luego con for
        int numero = 1;
        while (numero <= 100) {
            System.out.println(numero);
            numero++;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


//        Mostrar numeros de 1 al 100 incluidos divisibles por 2 y 3
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println(i);
            }
        }


//        Aplicacion q pida un numero de ventas y luego pida las ventas por teclado, al final sumar todas las ventas
        int numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas: "));
        double sumaVentas = 0;
        for (int i = 1; i <= numeroVentas; i++) {
            double venta = Double.parseDouble(JOptionPane.showInputDialog("Introduce la venta: "));
            sumaVentas += venta;
        }
        JOptionPane.showMessageDialog(null, "La suma de las ventas es: " + sumaVentas);


//        Leer numero por telcado, comprobar q sea mayor o igual a cero, si no lo es vuelve a pedir el numero usando do while
//        luego mostrar numero por pantalla
        double numero2;
        do {
            numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero mayor o igual a cero: "));
        } while (numero < 0);
        System.out.println("El numero es: " + numero2);


//        Aplicacion que compruebe una contrasena con 3 intentos maximo
        String password = "1234";
        int numeroIntentos = 0;
        while (numeroIntentos < 3) {
            String passwordIngresada = JOptionPane.showInputDialog("Introduce la contraseña: ");
            if (password.equals(passwordIngresada)) {
                JOptionPane.showMessageDialog(null, "Contraseña correcta");
                break; // Sale del bucle si la contraseña es correcta
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                numeroIntentos++;
            }
        }
        if (numeroIntentos == 3) {
            JOptionPane.showMessageDialog(null, "Has agotado tus intentos. ¡Adiós!");
        }


//        Aplicacion que pida un dia de la semana y nos diga si es un dia laboral o no, utilizar switch
        String dia = JOptionPane.showInputDialog("Introduce un dia de la semana: ");
        switch (dia) {
            case "lunes":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            case "martes":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            case "miercoles":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            case "jueves":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            case "viernes":
                JOptionPane.showMessageDialog(null, "Es un dia laboral");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es un dia laboral");
        }


//        Crear calculadora que pida dos operandos y una operacion string y nos devuelva el resultado
        int num5 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));
        int num6 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero: "));
        String operacion = JOptionPane.showInputDialog("Introduce la operacion (+, -, *, /, %): ");
        switch (operacion) {
            case "+":
                JOptionPane.showMessageDialog(null, num5 + num6);
                break;
            case "-":
                JOptionPane.showMessageDialog(null, num5 - num6);
                break;
            case "*":
                JOptionPane.showMessageDialog(null, num5 * num6);
                break;
            case "/":
                JOptionPane.showMessageDialog(null, num5 / num6);
                break;
            case "%":
                JOptionPane.showMessageDialog(null, num5 % num6);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operacion no valida");
                break;
        }


//        Crear aplicacion que permite ingresar numeros hasta que ingresemos un -1, en tal caso calcular cantidad de
//        numeros introducidos
        int contador = 0;
        int numero3;
        do {
            numero3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero (ingresa -1 para salir): "));
            if (numero3 != -1) {
                contador++;
            }
        } while (numero3 != -1);
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " numeros");


//      Calcular el factorial de un numero ingresado
        int numeroFactorial = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para calcular su factorial: "));
        int factorial = 1;
        for (int i = 1; i <= numeroFactorial; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numeroFactorial + " es: " + factorial);


//        Sumar pares e impares hasta un numero ingresado por teclado
        int numeroSumar = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        int sumaPar = 0;
        int sumaImpar = 0;
        for (int i = 1; i <= numeroSumar; i++) {
            if (i % 2 == 0) {
                sumaPar += i;
            } else {
                sumaImpar += i;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los pares es: " + sumaPar + " y la suma de los impares es: " + sumaImpar);


    }
}