
/**
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros. Si el promedio es:
 * De 0 a 5 el promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal.
 * Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio3 {

    static double mayor1 = 0;

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        double prom1, prom2, prom3, prom4;
        System.out.print("Deme el promedio 1, 2, 3, 4: ");
        prom1 = an.nextDouble();
        prom2 = an.nextDouble();
        prom3 = an.nextDouble();
        prom4 = an.nextDouble();

        promedio(prom1, prom2, prom3, prom4);
        System.out.println("El promedio mas alto es: " + mayor1);

    }

    public static void promedio(double p1, double p2, double p3, double p4) {
        if ((p1 > p2) && (p1 > p3) && (p1 > p4)) {
            mayor1 = p1;
        } else if ((p2 > p1) && (p2 > p3) && (p2 > p4)) {

            mayor1 = p2;

        } else if ((p3 > p1) && (p3 > p2) && (p3 > p4)) {

            mayor1 = p3;
        } else {

            mayor1 = p4;

        }
        if (mayor1 <= 5) {
            System.out.println("Promedio Regular");

        } else if (mayor1 <= 8) {
            System.out.println("Promedio Bueno");

        } else if (mayor1 <= 9) {
            System.out.println("Promedio Muy Bueno");

        } else if (mayor1 <= 10) {
            System.out.println("Promedio Sobresaliente");
        } else {
            System.out.println("Promedio fuera del rango establecido... Eres un crack");

        }
    }
}
/*
run:
Deme el promedio 1, 2, 3, 4: 10 1.5 3.4 100
Promedio fuera del rango establecido... Eres un crack
El promedio mas alto es: 100.0
*/