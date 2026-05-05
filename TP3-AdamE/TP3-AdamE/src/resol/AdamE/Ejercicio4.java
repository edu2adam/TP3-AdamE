package resol.AdamE;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fecha1 = null;
        LocalDate fecha2 = null;


        while (fecha1 == null) {
            System.out.print("Ingrese la primera fecha (dd/MM/yyyy): ");
            String input = scanner.nextLine();
            try {
                fecha1 = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Use dd/MM/yyyy.");
            }
        }


        boolean valida = false;
        while (!valida) {
            System.out.print("Ingrese la segunda fecha (dd/MM/yyyy) - debe ser posterior a la primera: ");
            String input = scanner.nextLine();
            try {
                fecha2 = LocalDate.parse(input, formatter);
                if (fecha2.isAfter(fecha1)) {
                    valida = true;
                } else {
                    System.out.println("Error: La segunda fecha debe ser posterior a la primera.");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Use dd/MM/yyyy.");
            }
        }


        long dias = calcularDiasEntre(fecha1, fecha2);
        System.out.println("Días entre " + fecha1.format(formatter) + " y " + fecha2.format(formatter) + ": " + dias);
    }

    public static long calcularDiasEntre(LocalDate inicio, LocalDate fin) {

        return ChronoUnit.DAYS.between(inicio, fin);
    }
}

/*
Nota caso de prueba:
01/05/2026
05/05/2026
*/