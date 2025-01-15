public class Matrices01_Intro {
    public static void main(String[] args) throws Exception {
        // EJEMPLO DE MATRIZ DESDE CERO
        int [][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3; 
        numeros[0][3] = 4;
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Número de filas: " + numeros.length);
        System.out.println("Número de columnas: " + numeros[0].length);
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        System.out.println("Último elemento de la matriz: " + numeros[numeros.length - 1][numeros[0].length -1]);

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
    }
}
