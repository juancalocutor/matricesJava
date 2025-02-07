public class Matrices07_Limites {
    public static void main (String[] args) {
        /*La idea es identificar los límites y cambiarlos por X
         * así se pueden crear imágenes sencillas rellenas con X
         * como cuadros, X, H, etc.
         */
        int[][] matriz = new int[10][10];
        // Después de creada la matriz trazamos la diagonal con X

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j || (j == matriz.length - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Aquí se imprime una H
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == 0 || (i == matriz.length / 2 && j != 0 && j != matriz.length - 1) 
                || (j == matriz.length - 1 && i >= matriz.length / 2)) {
                    System.out.print("X");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
