
/**
 * Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de un arreglo bidimensional cuadrado;
 * mismo que se lo recibe como parámetro.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int fc, fc2;
        System.out.print("Ingrese el tamaño de la matriz cuadrada debe ser igual a la segunda matriz cuadrada (n x n): ");
        fc = an.nextInt();
        int matriz1[][] = new int[fc][fc];
        System.out.print("Ingrese el tamaño de la segunda matriz cuadrada debe ser igual a la primera matriz (n x n): ");
        fc2 = an.nextInt();
        int matriz[][] = new int[fc2][fc2];

        matrizlCompletar(matriz1);
        matrizl2Completar(matriz);
        System.out.println("Mostrar Matriz");
        matrizlMostrar(matriz1);
        System.out.println("Mostrar matriz2");
        matrizl2Mostrar(matriz);
        sumaMatriz(matriz1, matriz, fc2);
        restaMatriz(matriz1, matriz, fc2);
        multiplicarMatriz(matriz1, matriz, fc);
    }

    public static void matrizlCompletar(int matriz1[][]) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print("Valores de la matriz en " + i + " " + j + " : ");
                Scanner an = new Scanner(System.in);
                matriz1[i][j] = an.nextInt();

            }
        }
    }

    public static void matrizlMostrar(int matriz1[][]) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void matrizl2Completar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Valores de la matriz en " + i + " " + j + " : ");
                Scanner an = new Scanner(System.in);
                matriz[i][j] = an.nextInt();

            }
        }
    }

    public static void matrizl2Mostrar(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void sumaMatriz(int matriz1[][], int matriz[][], int fc3) {
        int suma[][] = new int[fc3][fc3];
        System.out.println("La suma de matrices es: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                suma[i][j] = matriz[i][j] + matriz1[i][j];
                System.out.print(suma[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void restaMatriz(int matriz1[][], int matriz[][], int fc3) {
        int resta[][] = new int[fc3][fc3];
        System.out.println("La resta de matrices es: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                resta[i][j] = matriz1[i][j] - matriz[i][j];
                System.out.print(resta[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void multiplicarMatriz(int matriz1[][], int matriz[][], int fc) {
        int producto[][] = new int[fc][fc];
        System.out.println("La multiplicación de matrices es: ");
        for (int i = 0; i < fc; i++) {
            for (int j = 0; j < fc; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < fc; k++) {
                    producto[i][j] = matriz1[i][k] * matriz[k][j];
                }
                System.out.print(producto[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
/*run:
Ingrese el tamaño de la matriz cuadrada debe ser igual a la segunda matriz cuadrada (n x n): 2
Ingrese el tamaño de la segunda matriz cuadrada debe ser igual a la primera matriz (n x n): 2
Valores de la matriz en 0 0 : 1
Valores de la matriz en 0 1 : 2
Valores de la matriz en 1 0 : 3
Valores de la matriz en 1 1 : 4
Valores de la matriz en 0 0 : 4
Valores de la matriz en 0 1 : 3
Valores de la matriz en 1 0 : 2
Valores de la matriz en 1 1 : 1
Mostrar Matriz
1 2 
3 4 
Mostrar matriz2
4 3 
2 1 
La suma de matrices es: 
5 5 
5 5 
La resta de matrices es: 
-3 -1 
1 3 
La multiplicación de matrices es: 
4 2 
8 4 
*/