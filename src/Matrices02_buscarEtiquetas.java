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
            System.out.println("\nNúmero " + perdido + " encontrado en la casilla [" + (i + 1) + "][" + (j + 1) + "]\n");
        } else {
            System.out.println("El número no fue encontrado");
        }

    }
}
