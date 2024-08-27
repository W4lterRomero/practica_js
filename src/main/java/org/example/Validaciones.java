package org.example;
import java.util.Scanner;
public class Validaciones {
    public static String ingresarSoloNumeros() {
        Scanner scanner = new Scanner(System.in);
        String entrada;

        while (true) {
            System.out.print("Ingrese un número: ");
            entrada = scanner.nextLine();

            if (esNumerico(entrada)) {
                break;
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese solo números.");
            }
        }

        return entrada;
    }
    public static boolean esNumerico(String input) {
        return input.matches("\\d+"); // Verifica si la entrada contiene solo dígitos
    }
    public static boolean esSoloLetras(String input) {
        return input.matches("[a-zA-Z]+"); // Verifica si la entrada contiene solo letras
    }
}
