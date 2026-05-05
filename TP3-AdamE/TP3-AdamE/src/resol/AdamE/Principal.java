package resol.AdamE;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione el Ejercicio que desea ejecutar:");
        System.out.println(" 1. Ejercicio 1");
        System.out.println(" 2. Ejercicio 2");
        System.out.println(" 3. Ejercicio 3");
        System.out.println(" 4. Ejercicio 4");
        System.out.println(" 5. Ejercicio 5");
        System.out.println(" 6. Ejercicio 6");
        //int opcion = scanner.nextInt();
        int opcion= new Scanner(System.in).nextInt();
        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            /*case 5:
                Ejercicio5.ejecutar();
                break;
            case 6:
                Ejercicio6.ejecutar();
                break;*/
        
            default:
                System.out.println("Opcion no valida");
        }
        scanner.close();

    }
}
