package resol.AdamE;
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

    public static double buscarCaracter(String cadena, char c) {
        String cadenaLower = cadena.toLowerCase();
        char cLower = Character.toLowerCase(c);

        int contador = 0;
        StringBuilder posiciones = new StringBuilder();

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

        if (cadena.length() == 0) {
            return 0.0;
        }
        return (contador * 100.0) / cadena.length();
    }
}