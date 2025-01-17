import java.util.Scanner;

public class Matrices04_transpuestaasimetrica {
    public static void main(String[] args) {
        // TRANSPONER FILAS Y COLUMNAS DE UNA MATRIZ ASIMÉTRICA
        // SOLICITAMOS VALORES DE FILAS Y COLUMNAS AL USUARIO
        Scanner cs = new Scanner(System.in);
        System.out.println("\n¿Cu´natas filas y columnas tendrá la matriz?\n");
        System.out.print("Filas: ");
        int filas = cs.nextInt();
        System.out.print("Columnas: ");
        int columnas = cs.nextInt();
        // DEBEN CREARSE 2 MATRICES CON FILAS Y COLUMNAS OPUESTAS
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[columnas][filas];

        // LLENAMOS LA MATRIZ A
        System.out.println();
        System.out.println("Indique los valores de cada casilla\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Casilla[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrizA[i][j] = cs.nextInt();
            }
            System.out.println();
        }
        // SE IMPRIME LA MATRIZ ORIGINAL
        cs.close();
        System.out.println();
        System.out.println("=============== MATRIZ ORIGINAL ==============\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
        // AHORA PASAMOS LOS VALORES TRNASPUESTOS A LA MATRIZ B
        System.out.println();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println();
        System.out.println("==================== MATRIZ TRANSPUESTA EN B ==================\n");
        // SE IMPRIME LA MATRIZ B
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

    }
}
