> **Autor:** *Ricardo Espinosa*
# Caminos Mínimos en **Grafos Dirigidos**: Algoritmo de Dijkstra

## ARCHIVO JAVA
Ademas de esta documentación, adjunto el enlace del archivo java: [archivo java](../../tareas/tarea_7(2Bim)/MST_dirig_dijkstra.java)

En los grafos dirigidos y ponderados, encontrar el **camino mínimo** (la ruta más corta) entre un nodo origen y los demás es un problema clásico con aplicaciones en redes, mapas, logística y mucho más. El **algoritmo de Dijkstra** es una de las soluciones más usadas para este propósito.

## ¿Qué hace Dijkstra?

Dijkstra calcula la distancia mínima desde un nodo de origen hasta todos los demás nodos del grafo. Lo hace de manera eficiente, eligiendo siempre la opción de menor costo en cada paso y actualizando los caminos más cortos de forma progresiva. Funciona perfectamente cuando **los pesos de las aristas son no negativos**.

## ¿Cómo funciona?

* Inicializa todas las distancias como infinito, excepto el nodo origen (que es cero).
* Marca los nodos visitados y selecciona en cada paso el nodo no visitado más cercano.
* Actualiza las distancias de sus vecinos si encuentra un camino más corto.
* Repite hasta recorrer todos los nodos.

Este método garantiza que la primera vez que llegas a un nodo, ya tienes la distancia mínima.

---

## Código Java (Algoritmo de Dijkstra para grafos dirigidos)

```java
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
```

---

**Este código permite hallar el camino mínimo desde el nodo origen hasta todos los demás, mostrando claramente las distancias mínimas o indicando si un nodo es inalcanzable desde el origen.**