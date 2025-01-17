import java.util.Scanner;

public class Matrices03_transpuesta {
    public static void main (String[] args) throws Exception {
        // CAMBIAR LAS FILAS A LAS COLUMNAS
        //DECLARAMOS LA MATRIZ
        int filas = 4;
        int columnas = 4;

        int[][] matriz = new int[filas][columnas];
        System.out.println("\nEsta es una matriz de 4 X 4\n");
        // CLICLO PARA LLENAR LA MATRIZ
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el número de la casilla [" + (i + 1) + "][" + (j + 1) + "] : ");
                matriz[i][j] = consola.nextInt();
            }
        }
        consola.close();
        // SE IMPRIME LA MATRIZ ORIGINAL
        System.out.println();
        System.out.println("=============== MATRIZ ORIGINAL ===============\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + matriz[i][j] + "\t");
            }
            System.out.println();
        }
        // CICLOS PARA TRANSPONER LAS FILAS A LAS COLUMNAS
        // Se crea una variable auxiliar para guardar la matriz original
        int aux;

        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
        System.out.println();
        System.out.println("================== MATRIZ TRANSPUESTA ================\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = " + matriz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
