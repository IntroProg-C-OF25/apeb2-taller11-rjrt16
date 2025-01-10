
/**
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10* En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble.
 * Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio.
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio4 {

    static double plani, predio;

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int cedula, kiloU, inmueble, pagar;
        String nombre;
        double kiloV;

        System.out.print("Deme su primer nombre y primer apellido: ");
        nombre = an.nextLine();
        System.out.print("Deme su numero de cedula: ");
        cedula = an.nextInt();
        //Planilla de luz
        System.out.print("Deme el valor del kilovatio en su zona: ");
        kiloV = an.nextDouble();
        System.out.print("Deme el numero de kilovatios que utilizo: ");
        kiloU = an.nextInt();
        System.out.print("Deme el valor de inmueble: ");
        inmueble = an.nextInt();
        System.out.println("Que desea ver su planilla (1) o su inmuble (2)");
        pagar = an.nextInt();

        switch (pagar) {
            case 1:
                planilla(kiloV, kiloU);
                System.out.println("Cliente " + nombre + " con cedula " + cedula + " debe cancelar el valor de: " + plani);
                break;
            case 2:
                predioPagar(inmueble);
                System.out.println("Cliente " + nombre + " con cedula " + cedula + " tiene un bien inmuble valorado en " + inmueble + " y tiene que pagar el precio de " + predio);
                break;
            default:
                System.out.println("Solo 1 o 2");
        }

    }

    public static void planilla(double vatioV, int vatioU) {
        plani = vatioV * vatioU;
    }

    public static void predioPagar(int inmueble) {
        predio = inmueble * 0.02;
    }
}
/*
run:
Deme su primer nombre y primer apellido: Ricardo Rosales
Deme su numero de cedula: 1105591323
Deme el valor del kilovatio en su zona: 2
Deme el numero de kilovatios que utilizo: 5
Deme el valor de inmueble: 30000
Que desea ver su planilla (1) o su inmuble (2)
2
Cliente Ricardo Rosales con cedula 1105591323 tiene un bien inmuble valorado en 30000 y tiene que pagar el precio de 600.0
*/