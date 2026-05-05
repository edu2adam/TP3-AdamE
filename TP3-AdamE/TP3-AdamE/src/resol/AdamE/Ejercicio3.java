package resol.AdamE;   // Reemplaza "AdamE" por tu apellido e inicial

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese un carácter a buscar: ");
        char caracter = scanner.next().charAt(0);

        double porcentaje = buscarCaracter(texto, caracter);
        System.out.printf("El carácter '%c' representa el %.2f%% del texto.\n", caracter, porcentaje);
    }

    /**
     * Método estático que busca todas las posiciones de un carácter en una cadena
     * (ignorando mayúsculas/minúsculas) y muestra los índices encontrados.
     * 
     * @param cadena Texto donde buscar
     * @param c      Carácter a buscar
     * @return Porcentaje de apariciones del carácter (0.0 si no aparece)
     */
    public static double buscarCaracter(String cadena, char c) {
        // Convertir toda la cadena y el carácter a minúsculas (o mayúsculas) para ignorar case
        String cadenaLower = cadena.toLowerCase();
        char cLower = Character.toLowerCase(c);

        int contador = 0;
        StringBuilder posiciones = new StringBuilder();

        // Recorrer la cadena y guardar índices
        for (int i = 0; i < cadenaLower.length(); i++) {
            if (cadenaLower.charAt(i) == cLower) {
                contador++;
                if (posiciones.length() > 0) {
                    posiciones.append(", ");
                }
                posiciones.append(i);
            }
        }

        // Mostrar las posiciones encontradas
        if (contador == 0) {
            System.out.println("El carácter '" + c + "' no se encuentra en la cadena.");
        } else {
            System.out.println("El carácter '" + c + "' aparece en las posiciones: " + posiciones.toString());
        }

        // Calcular porcentaje (evitar división por cero)
        if (cadena.length() == 0) {
            return 0.0;
        }
        return (contador * 100.0) / cadena.length();
    }
}