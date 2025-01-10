
/**
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular
 * el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada
 * procedimiento/función debe recibir los datos necesarios y generar el valor
 * correspondiente. Se debe invocar a los procedimientos desde un método
 * principal; Si el usuario ingresa 1 se llama al procedimiento
 * obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se
 * llama al procedimiento obtenerAreaCuadrado. El área del cuadrado es igual a
 * lado x lado x lado x lado El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejericio2 {

    static double areaC, areaT, areaR;

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int lado, base, altura;
        System.out.println("Deme el lado de cuadrado: ");
        lado = an.nextInt();
        System.out.println("Deme la base del triagunlo: ");
        base = an.nextInt();
        System.out.println("Deme la altura del triangulo:  ");
        altura = an.nextInt();

        areaCuadrado(lado);
        System.out.println("El area del cuadrado es: " + areaC);
        areaTriangulo(base, altura);
        System.out.println("El area del triangulo es: " + areaT);
        areaRectangulo(base, altura);
        System.out.println("El area del Rectangulo es: " + areaR);
    }

    public static void areaCuadrado(int lado1) {
        areaC = (lado1 * lado1 * lado1 * lado1);

    }

    public static void areaTriangulo(int base1, int altura1) {
        areaT = ((base1 * altura1) / 2);
    }

    public static void areaRectangulo(int base2, int altura2) {
        areaR = (base2 * altura2);
    }
}
/*
run:
Deme el lado de cuadrado: 
3 
Deme la base del triagunlo: 
3
Deme la altura del triangulo:  
3
El area del cuadrado es: 81.0
El area del triangulo es: 4.0
El area del Rectangulo es: 9.0
 */
