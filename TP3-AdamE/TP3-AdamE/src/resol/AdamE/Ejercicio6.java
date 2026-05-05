package resol.AdamE;
import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el mensaje a cifrar: ");
        String mensaje = scanner.nextLine();

        System.out.print("Ingrese el desplazamiento (número entero): ");
        int desplazamiento = scanner.nextInt();

        String cifrado = cifrarCesar(mensaje, desplazamiento);
        System.out.println("Mensaje cifrado: " + cifrado);
    }

    public static String cifrarCesar(String texto, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();
        desplazamiento = desplazamiento % 26; 

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (Character.isUpperCase(c)) {
                char nuevo = (char) ('A' + (c - 'A' + desplazamiento + 26) % 26);
                resultado.append(nuevo);
            } 
            else if (Character.isLowerCase(c)) {
                char nuevo = (char) ('a' + (c - 'a' + desplazamiento + 26) % 26);
                resultado.append(nuevo);
            } 
            else {
                resultado.append(c); 
            }
        }
        return resultado.toString();
    }
}