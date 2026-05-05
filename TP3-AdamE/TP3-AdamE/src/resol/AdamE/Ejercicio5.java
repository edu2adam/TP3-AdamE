package resol.AdamE;

import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int numero;


        do {
            System.out.print("Ingrese un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Debe ingresar un número entero válido: ");
                scanner.next();
            }
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: El número debe ser positivo.");
            }
        } while (numero <= 0);

        String binario = convertirABinario(numero);
        System.out.println("El número " + numero + " en binario es: " + binario);
    }


    public static String convertirABinario(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        int numero = decimal;

        while (numero > 0) {//me rompio la cabeza implementar esto
            int resto = numero % 2;     
            binario.append(resto);       
            numero = numero / 2;         
        }

        return binario.reverse().toString();
    }
}