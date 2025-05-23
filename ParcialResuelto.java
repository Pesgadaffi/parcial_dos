import java.util.Random;

public class ParcialResuelto {

    public static void main(String[] args) {
        int[][] laberinto = generarMatriz(); // Matriz generada aleatoriamente
        mostrarMatriz(laberinto); // Se muestra la matriz base

        System.out.println("\n=== RESULTADOS ===");

        int cantidadParesMayoresA4 = contarParesMayoresA4(laberinto);
        System.out.println("1. Pares mayores a 4: " + cantidadParesMayoresA4);

        double promedioImpares = calcularPromedioImpares(laberinto);
        System.out.printf("2. Promedio de impares: %.2f\n", promedioImpares);

        System.out.println("3. Suma de cada fila:");
        sumarFilas(laberinto);
    }

    // Método para generar la matriz aleatoria
    public static int[][] generarMatriz() {
        int[][] matriz = new int[5][5];
        Random random = new Random();

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                matriz[fila][col] = random.nextInt(9) + 1;
            }
        }

        return matriz;
    }


    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("--- Laberinto Universitario ---");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                
        System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método para contar pares mayores a 4
    public static int contarParesMayoresA4(int[][] matriz) {
        int contador = 0;
        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 == 0 && valor > 4) {
                    contador++;
                }
            }
        }
        return contador;
    }
// Método para calcular promedio de impares
    public static double calcularPromedioImpares(int[][] matriz) {
        int suma = 0;
        int contador = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                if (valor % 2 != 0) {
                    suma += valor;
                    contador++;
                }
            }
        }

        return contador > 0 ? (double) suma / contador : 0;
    }

    // Método para sumar los valores de cada fila
    public static void sumarFilas(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            int sumaFila = 0;
            for (int col = 0; col < matriz[fila].length; col++) {
                sumaFila += matriz[fila][col];
            }
            System.out.println("Fila " + fila + ": " + sumaFila);
        }
    }
}
    
