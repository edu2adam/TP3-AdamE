package resol.AdamE;   // Cambia "AdamE" por tu apellido e inicial

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {


    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese el tamaño de la matriz cuadrada (N): ");
        int n = scanner.nextInt();

        // Crear y llenar la matriz con números aleatorios entre 1 y 100
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(100) + 1; // 1 a 100
            }
        }


        System.out.println("\nMatriz generada:");// Mostrar la matriz 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        // Calcular sumas de diagonales
        int sumaPrincipal = sumarDiagonalPrincipal(matriz);
        int sumaSecundaria = sumarDiagonalSecundaria(matriz);

        System.out.println("\nSuma de la diagonal principal: " + sumaPrincipal);
        System.out.println("Suma de la diagonal secundaria: " + sumaSecundaria);

        
        determinarMayorSuma(sumaPrincipal, sumaSecundaria);
    }

    
    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];          // fila = columna
        }
        return suma;
    }

    
    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];   // fila i, columna N-1-i
        }
        return suma;
    }

    
    public static void determinarMayorSuma(int sumaP, int sumaS) {
        int mayor = Math.max(sumaP, sumaS);
        if (mayor == sumaP && mayor == sumaS) {
            System.out.println("Ambas sumas son iguales: " + sumaP);
        } else if (mayor == sumaP) {
            System.out.println("La suma de la diagonal principal es mayor: " + sumaP);
        } else {
            System.out.println("La suma de la diagonal secundaria es mayor: " + sumaS);
        }
    }
}