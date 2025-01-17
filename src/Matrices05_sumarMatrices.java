import java.util.Scanner;

public class Matrices05_sumarMatrices {
    public static void main (String[] args) throws Exception {

        int fila = 3, columna = 3;
        int[][] a = new int[fila][columna];
        int[][] b = new int[fila][columna];
        int[][] suma = new int[fila][columna];

        // LLENAMOS LAS MATRICES
        Scanner lb = new Scanner(System.in);
        System.out.println();
        System.out.println("Valores matriz A:\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Casilla[" + (i + 1) + "][" + (j + 1) + "] = ");
                a[i][j] = lb.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Valores matriz B:\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Casilla[" + (i + 1) + "][" + (j + 1) + "] = ");
                b[i][j] = lb.nextInt();
            }
            System.out.println();
        }
        lb.close();

        System.out.println();
        // SE IMPRIME LA MATRIZ SUMA
        System.out.println("====== Matriz A =======\n");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("========= Matriz B ==========\n");
        // SE IMPRIME LA MATRIZ SUMA
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + b[i][j] + "\t");
            }
            System.out.println();
        }
        // SUMAMOS LAS MATRICES
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println();
        System.out.println("La suma de las matrices a y b es: \n");
        // SE IMPRIME LA MATRIZ SUMA
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + suma[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
