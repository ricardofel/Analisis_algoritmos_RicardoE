package vista;

import java.util.Arrays;
// RICARDO FABIAN ESPINOSA LARGO
public class mergeSort {

    public static void main(String[] args) {
        int[] A = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Arreglo original: " + Arrays.toString(A));
        // mergeSort(Arreglo, posicionInicial, indiceFinal);
        mergeSort(A, 0, A.length - 1);
        System.out.println("Arreglo ordenado: " + Arrays.toString(A));
    }

    public static void merge(int[] A, int p, int q, int r) {
        // Calculamos el tamaño de los subarreglos
        int nL = q - p + 1; // nL = número de elementos de la parte izquierda A[p..q]
        int nR = r - q;     // nR = número de elementos de la parte derecha A[q+1..r]

        // Creamos dos arreglos temporales para guardar cada mitad
        int[] L = new int[nL]; // Arreglo izquierdo L[0..nL-1]
        int[] R = new int[nR]; // Arreglo derecho R[0..nR-1]

        // Copiamos los elementos de A[p..q] dentro de L
        for (int i = 0; i < nL; i++) {
            L[i] = A[p + i]; // Copiamos A[p+i] en L[i]
        }

        // Copiamos los elementos de A[q+1..r] dentro de R
        for (int j = 0; j < nR; j++) {
            R[j] = A[q + 1 + j]; // Copiamos A[q+1+j] en R[j]
        }

        // Inicializamos los índices para recorrer L, R y A
        int i = 0; // i recorre el arreglo L
        int j = 0; // j recorre el arreglo R
        int k = p; // k es la posición actual en el arreglo A que estamos llenando

        // Mientras haya elementos en ambos arreglos L y R
        while (i < nL && j < nR) {
            // Comparamos los elementos actuales de L y R
            if (L[i] <= R[j]) {
                // Si el elemento de L es menor o igual, lo colocamos en A[k]
                A[k] = L[i];
                i++; // Avanzamos en L
            } else {
                // Si el elemento de R es menor, lo colocamos en A[k]
                A[k] = R[j];
                j++; // Avanzamos en R
            }
            k++; // Avanzamos en A
        }

        // Si todavía quedan elementos en L, los copiamos todos a A
        while (i < nL) {
            A[k] = L[i];
            i++;
            k++;
        }

        // Si todavía quedan elementos en R, los copiamos todos a A
        while (j < nR) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // Encuentra el punto medio
            mergeSort(A, p, q);   // Ordena la primera mitad
            mergeSort(A, q + 1, r); // Ordena la segunda mitad
            merge(A, p, q, r);     // Fusiona las dos mitades ordenadas
        }
    }

}