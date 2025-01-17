import java.util.Scanner;

public class Matrices02_buscarEtiquetas {
    public static void main(String[] args) throws Exception {
        System.out.println("\n======================== BUSCAR CON ETIQUETA ============================");
        // INICIAMOS LAS VARIABLES DE LA MATRIZ
        int fila, columna, perdido;
        boolean encontrado = false;
        // SOLICITAMOS NÚMEROS DE FILAS Y COLUMNAS
        Scanner consola = new Scanner(System.in);
        System.out.print("\nMatriz de cuántas filas: ");
        fila = consola.nextInt();
        consola.nextLine();
        System.out.print("\nY Cuántas columnas: ");
        columna = consola.nextInt();
        // CREAMOS LA MATRIZ
        System.out.println();
        int[][] numeros = new int[fila][columna];
        // CICLOS PARA LLENAR LA MATRIZ
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("Indique el valor de la casilla [" + (i + 1) + "][" + (j + 1) + "] : ");
                numeros[i][j] = consola.nextInt();
            }
            System.out.println();
        }
        System.out.println();
        // SE PREGUNTA POR EL NÚMERO A BUSCAR
        System.out.print("\nIndique el número que desea buscar: ");
        perdido = consola.nextInt();
        // CICLO FOR PARA LA BUSQUEDA
        int i;
        int j = 0;
        buscar: for (i = 0; i < fila; i++) {
            for (j = 0; j < columna; j++) {
                if (numeros[i][j] == perdido) {
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado) {
            System.out
                    .println("\nNúmero " + perdido + " encontrado en la casilla [" + (i + 1) + "][" + (j + 1) + "]\n");
        } else {
            System.out.println("El número no fue encontrado");
        }

        System.out.println();
        System.out.println("========================= AHORA CON STRING ======================\n");
        // PEDIMOS DIMENSIONES DE LA MATRIZ DE STRING
        System.out.print("¿Cuántas filas tendra la matriz? ");
        int filaNombres = consola.nextInt();
        System.out.println();
        System.out.print("Y cuántas columnas ");
        int columNombres = consola.nextInt();
        consola.nextLine();
        System.out.println();
        // CREAMOS LA MATRIZ
        String[][] nombreString = new String[filaNombres][columNombres];
        // CICLO PARA PEDIR NOMBRES
        for (int k = 0; k < filaNombres; k++) {
            for (int k2 = 0; k2 < columNombres; k2++) {
                System.out.print("Nombre " + (k + 1) + " - " + (k2 + 1) + ": ");
                nombreString[k][k2] = consola.nextLine();
            }
        }

        System.out.println();

        // CILCO PARA IMPRIMIR NOMBRES
        for (int k = 0; k < filaNombres; k++) {
            for (int k2 = 0; k2 < columNombres; k2++) {
                System.out.print("Nombre casilla [" + (k + 1) + "][" + (k2 + 1) + "]: " + nombreString[k][k2] + "\t");
            }
            System.out.println();
        }

        // CICLO PARA BUSCAR
        System.out.println();
        System.out.print("¿Qué nombre desea buscar? ");
        String NN = consola.nextLine();

        int k;
        int k2 = 0;
        boolean findNom = false;
        Kraken: for (k = 0; k < filaNombres; k++) {
            for (k2 = 0; k2 < columNombres; k2++) {
                if (NN.equalsIgnoreCase(nombreString[k][k2])) {
                    findNom = true;
                    break Kraken;
                }
            }
        }

        System.out.println();

        if (findNom) {
            System.out.println("Nombre encontrado en la casilla [" + (k + 1) + "][" + (k2 + 1) + "]");
        } else {
            System.out.println("Nombre no encontrado");
        }
    }
}
