package ejerciciosotros;

public class EjerciciosLibro {
    public static void main(String[] args) {
////        Colores de la terminal
//        System.out.println("┌────────┬───────────┬────────┬────────────────┐");
//        System.out.println("│ Código │ Color │ Código │ Color │");
//        System.out.println("├────────┼───────────┼────────┼────────────────┤");
//        System.out.print("│ 30 │\033[30m negro \033[39;49m │");
//        System.out.println(" 90 │\033[90m negro claro \033[39;49m │");
//        System.out.print("│ 31 │\033[31m rojo \033[39;49m │");
//        System.out.println(" 91 │\033[91m rojo claro \033[39;49m │");
//        System.out.print("│ 32 │\033[32m verde \033[39;49m │");
//        System.out.println(" 92 │\033[92m verde claro \033[39;49m │");
//        System.out.print("│ 33 │\033[33m amarillo \033[39;49m │");
//        System.out.println(" 93 │\033[93m amarillo claro \033[39;49m│");
//        System.out.print("│ 34 │\033[34m azul \033[39;49m │");
//        System.out.println(" 94 │\033[94m azul claro \033[39;49m │");
//        System.out.print("│ 35 │\033[35m morado \033[39;49m │");
//        System.out.println(" 95 │\033[95m morado claro \033[39;49m │");
//        System.out.print("│ 36 │\033[36m cian \033[39;49m │");
//        System.out.println(" 96 │\033[96m cian claro \033[39;49m │");
//        System.out.print("│ 37 │\033[37m blanco \033[39;49m │");
//        System.out.println(" 97 │\033[97m blanco claro \033[39;49m │");
//        System.out.println("└────────┴───────────┴────────┴────────────────┘");
//
//
//        System.out.printf("Los números %d %d no tiene decimales.\n", 21, 22);
//        System.out.printf("El número %f sale con decimales.\n", 21.0656);
//        System.out.printf("El %.3f sale exactamente con 3 decimales.\n", 21.0);
//
//        System.out.println(" Artículo Precio/caja Nº cajas");
//        System.out.println("-----------------------------------------");
//        System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
//        System.out.printf("%10s %8.2f %6d\n", "peras", 2.75, 120);
//        System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
//
//
////        1
//        System.out.println("My name is John Smith");
////        2
//        System.out.println("My name is John Smith ");
//        System.out.println("My phone number is 123-456-7890");
////        3
//        System.out.println("| Traductor |");
//        System.out.println("-------------------");
//        System.out.printf("%-10s %-10s\n", "English", "Spanish");
//        System.out.printf("%-10s %-10s\n", "computer", "ordenador");
//        System.out.printf("%-10s %-10s\n", "student", "alumno\\a");
//        System.out.printf("%-10s %-10s\n", "cat", "gato");
//        System.out.printf("%-10s %-10s\n", "penguin", "pingüino");
//        System.out.printf("%-10s %-10s\n", "machine", "máquina");
//        System.out.printf("%-10s %-10s\n", "nature", "naturaleza");
//        System.out.printf("%-10s %-s\n", "light", "luz");
//        System.out.printf("%-10s %-s\n", "green", "verde");
//        System.out.printf("%-10s %-s\n", "book", "libro");
//        System.out.printf("%-10s %-s\n", "pyramid", "pirámide");
////        4
//        System.out.println("**** Horario de clases ****");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "10:00", "Matematicas", "Historia", "Geografia", "Ingles", "Fisica");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "11:00", "Geografia", "Ingles", "Fisica", "Matematicas", "Historia");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "12:00", "Fisica", "Matematicas", "Historia", "Geografia", "Ingles");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "13:00", "Historia", "Geografia", "Ingles", "Fisica", "Matematicas");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "14:00", "Ingles", "Fisica", "Matematicas", "Historia", "Geografia");
//        System.out.printf("%-6s %-12s %-12s %-12s %-12s %-12s\n", "15:00", "Geografia", "Ingles", "Fisica", "Matematicas", "Historia");
////        5
//        String rojo = "\033[31m";
//        String verde = "\033[32m";
//        String naranja = "\033[33m";
//        String azul = "\033[34m";
//        String morado = "\033[35m";
//        String celeste = "\033[36m";
//        String blanco = "\033[37m";
//        System.out.println(naranja + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
//        System.out.println("======\t=======\t======\t======\t=======");
//        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
//        System.out.println(verde + "PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
//        System.out.println(celeste + "ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
//        System.out.println(naranja + "FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
//        System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
//        System.out.println(naranja + "FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
////        6
//        System.out.println("    *    ");
//        System.out.println("   ***   ");
//        System.out.println("  *****  ");
//        System.out.println(" ******* ");
//        System.out.println("*********");
//        //7
//        System.out.println("    *    ");
//        System.out.println("   * *   ");
//        System.out.println("  *   *  ");
//        System.out.println(" *     * ");
//        System.out.println("*********");
//        //8
//        System.out.println("*********");
//        System.out.println(" *     * ");
//        System.out.println("  *   *  ");
//        System.out.println("   * *   ");
//        System.out.println("    *    ");





    }
}




