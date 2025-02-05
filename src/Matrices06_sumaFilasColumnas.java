import java.util.Scanner;

public class Matrices06_sumaFilasColumnas {
    public static void main(String[] args) {
        // Variables
        int fila, columna, sumaFila = 0, sumaColumna = 0, sumFil, sumCol;

        Scanner console = new Scanner(System.in);
        System.out.println("===== LAS FILAS Y COLUMNAS DEBEN COINCIDER =====");
        System.out.println("Indique las filas y columnas de la matriz\n");
        System.out.print("Filas y columnas: ");
        fila = console.nextInt();
        columna = fila;
        // System.out.print("Columnas: ");
        // columna = console.nextInt();

        System.out.println();

        // Creamos la matriz
        int[][] mat = new int[fila][columna];
        // Llenamos la matriz
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Casilla[" + (i +1) + "][" + (j + 1) + "] = ");
                mat[i][j] = console.nextInt();
            }
            System.out.println();
        }

        console.close();
        // Se imprime la matriz original
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // Sumamos
        /*Al iniciar la variable en el main se suman todos los valores de línea y columna
         * al inicarlas en el primer ciclo se reinicia a cero y se suma cada fila y columna
         * por separado
         */
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                sumaFila += mat[i][j];
                sumaColumna += mat[j][i];
            }
            System.out.println("Suma fila = " + sumaFila);
            System.out.println("Suma Columna = " + sumaColumna);
        }

        System.out.println(" ");

        for (int i = 0; i < fila; i++) {
            sumFil = 0;
            sumCol = 0;
            for (int j = 0; j < columna; j++) {
                sumFil += mat[i][j];
                sumCol += mat[j][i];
            }
            System.out.println("Suma fila = " + sumFil);
            System.out.println("Suma Columna = " + sumCol);
        }

    }
}
