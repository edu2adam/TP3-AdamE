package resol.AdamE;  
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int [] arreglo = new int[10];
        int total=11;
        for (int i = 0; i < arreglo.length; i++) {
            total=total-1;
            System.out.println("Ingrese el numero entero (" + total +" faltan ingresar):");
            arreglo[i] = scanner.nextInt();
            
        }

        for(int n=0;n<10;n++){
           primo(arreglo[n]);
        }

        int promedio = promPrimo(arreglo);

        System.out.println("El promedio de los numeros primos es: " + promedio);


    }

    public static void primo(int n){
        boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <=  Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if(esPrimo==true){
            System.out.println(n + " es un numero primo.");
            
        }else{
            System.out.println(n + " no es un numero primo.");
        }
        return ; 
    }

    public static boolean primosBoolean(int n){
                boolean esPrimo = true;
        if (n <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <=  Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        return esPrimo;
    }


    public static int promPrimo(int arreglo[]){
        int suma=0;
        int cantidadPrimos=0;
        int contador=0;
        for(int i=0;i<10;i++){
            if(primosBoolean(arreglo[i])==true){
                suma=suma+arreglo[i];
                contador++;
            }
        }
        int promedio = suma/contador;
        return promedio;
    }
}


