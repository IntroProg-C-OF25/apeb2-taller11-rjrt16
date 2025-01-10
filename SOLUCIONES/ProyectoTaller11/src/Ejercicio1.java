
/**
 * Generar los procedimientos y/o funciones que impriman los valor pares, impares y el promedio de un arreglo bidimensional.
 * El (los) procedimiento(s) o método(s) deben ser invocados desde el método principal
 * (quien es el único responsable de gestionar las entradas/salidas);
 * además el método debe recibir como parámetro un arreglo bidimensional.
 *
 * @author Ricardo Rosales
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);
        int fila = 0, columna = 0;
        System.out.print("Dame el limite de las filas y columnas: ");
        fila = an.nextInt();
        columna = an.nextInt();
        int matriz[][] = new int[fila][columna];
        generarMatriz(matriz);
        System.out.println("Matriz Generada: ");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        promedio(matriz);
    }

    //Generar Matriz 
    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

            }

        }

    }

    //Presentar Matriz
    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("Elementos Pares");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + ("") : "");
                /* 
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                } else if (matriz[i][j] % 3 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
                 */
            }
            System.out.println("");
        }
        System.out.println("Elementos Impares");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + ("") : "");
            }
            System.out.println("");
        }
    }

    public static void promedio(int matriz[][]) {
        int sumaMatriz = 0;
        double promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                sumaMatriz += matriz[i][j];
            }
        }
        promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("Promedio de la matri: " + promedioMatriz);
    }
}
/*
run:
Dame el limite de las filas y columnas: 3 3 
Matriz Generada: 
7 9 2 
4 9 6 
6 1 6 
Elementos Pares
2
46
66
Elementos Impares
79
9
1
Promedio de la matri: 4.0
*/
