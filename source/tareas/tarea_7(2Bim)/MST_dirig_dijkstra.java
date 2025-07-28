package mst_dirig_dijkstra;

import java.util.*;

class DijkstraMinimo {
    static final int INF = Integer.MAX_VALUE; // REPRESENTA INFINITO

    // FUNCION DIJKSTRA
    public void dijkstra(int[][] grafo, int origen) {
        int n = grafo.length;
        int[] dist = new int[n];      // DISTANCIA DESDE ORIGEN A CADA NODO
        boolean[] visitado = new boolean[n]; // MARCA SI YA SE PROCESO EL NODO

        // INICIALIZAR DISTANCIAS EN INFINITO Y VISITADO EN FALSO
        for (int i = 0; i < n; i++) {
            dist[i] = INF;
            visitado[i] = false;
        }

        // LA DISTANCIA AL ORIGEN SIEMPRE ES 0
        dist[origen] = 0;

        // RECORRER TODOS LOS NODOS
        for (int i = 0; i < n - 1; i++) {
            // BUSCAR EL NODO NO VISITADO CON DISTANCIA MINIMA
            int u = minDistancia(dist, visitado);

            // MARCAR COMO VISITADO
            visitado[u] = true;

            // ACTUALIZAR DISTANCIAS DE LOS VECINOS
            for (int v = 0; v < n; v++) {
                // SI HAY ARISTA, NO SE HA VISITADO Y ES MEJOR CAMINO
                if (!visitado[v] && grafo[u][v] != 0 && dist[u] != INF
                        && dist[u] + grafo[u][v] < dist[v]) {
                    dist[v] = dist[u] + grafo[u][v];
                }
            }
        }

        // IMPRIMIR RESULTADOS
        System.out.println("DISTANCIAS MINIMAS DESDE EL NODO " + origen + ":");
        for (int i = 0; i < n; i++) {
            if (dist[i] == INF) {
                System.out.println("A NODO " + i + ": NO ALCANZABLE");
            } else {
                System.out.println("A NODO " + i + ": " + dist[i]);
            }
        }
    }

    // ENCUENTRA EL NODO NO VISITADO CON MENOR DISTANCIA
    int minDistancia(int[] dist, boolean[] visitado) {
        int min = INF, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visitado[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
public class MST_dirig_dijkstra {
    public static void main(String[] args) {
        // EJEMPLO DE GRAFO DIRIGIDO COMO MATRIZ DE ADYACENCIA
        // 0 SIGNIFICA QUE NO HAY CONEXION DIRECTA
        int[][] grafo = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {0, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 0, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 0, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 10, 0, 0},
            {0, 0, 0, 0, 0, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 6},
            {0, 0, 0, 0, 0, 0, 0, 0, 7},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        int origen = 0; // CAMBIA EL NODO DE ORIGEN SI LO NECESITAS

        DijkstraMinimo dijkstra = new DijkstraMinimo();
        dijkstra.dijkstra(grafo, origen);
    }
}