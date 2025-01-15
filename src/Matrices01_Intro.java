public class Matrices01_Intro {
    public static void main(String[] args) throws Exception {
        // EJEMPLO DE MATRIZ DESDE CERO
        int fila = 2, columna = 4;
        int [][] numeros = new int[fila][columna];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3; 
        numeros[0][3] = 4;
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Número de filas: " + fila);
        System.out.println("Número de columnas: " + columna);
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Último elemento de la matriz: " + numeros[fila - 1][columna -1]);

        System.out.println(" ");
        // RECUPERAR VALORES DE UNA MATRIZ
        // ASIGNAMOS LOS VALORES A VARIABLES
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];
        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        System.out.println("Número 3: " + num3);
        System.out.println("Número 4: " + num4);
        System.out.println("Número 5: " + num5);
        System.out.println("Número 6: " + num6);
        System.out.println("Número 7: " + num7);
        System.out.println("Número 8: " + num8);

        // IMPRIMIR CON CICLO FOR
        System.out.println("=================== IMPRIMIR CON CICLO FOR ======================");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("fila [" + i + "] columna [" + j + "] => " + numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
