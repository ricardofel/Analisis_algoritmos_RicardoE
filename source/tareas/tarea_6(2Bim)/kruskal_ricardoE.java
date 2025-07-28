package arbol_recubrimiento_minimo;

import java.util.Scanner;
import java.util.*;

// RICARDO FABIAN ESPINOSA LARGO

class KruskalMST {
    // REPRESENTA UNA ARISTA, OSEA UNA UNION ENTRE DOS NODOS CON SU PESO
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;
        Edge(int s, int d, int w) {
            src = s; dest = d; weight = w;
        }
        // PARA ORDENAR FACIL LAS ARISTAS DE MENOR A MAYOR PESO
        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
        public String toString() {
            return "(" + src + " - " + dest + " : " + weight + ")";
        }
    }

    // SUBCONJUNTO PARA UNION-FIND, SIRVE PARA SABER SI YA ESTAN CONECTADOS
    static class Subset {
        int parent, rank;
    }

    int V; // NUMERO DE NODOS
    ArrayList<Edge> edges = new ArrayList<>();

    public KruskalMST(int v) {
        V = v;
    }

    // AGREGA UNA ARISTA
    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    // UNION-FIND: ENCUENTRA QUIEN ES EL JEFE DEL NODO
    int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }

    // UNION-FIND: UNE DOS CONJUNTOS
    void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);

        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;
        else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    // EL MERO ALGORITMO DE KRUSKAL
    public void kruskalMST() {
        Collections.sort(edges); // ORDENAR TODAS LAS ARISTAS

        Edge[] result = new Edge[V - 1]; // ARISTAS DEL MST
        int e = 0; // CONTADOR DEL MST
        int i = 0; // INDICE PARA RECORRER LAS ARISTAS

        Subset[] subsets = new Subset[V];
        for (int v = 0; v < V; ++v) {
            subsets[v] = new Subset();
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        System.out.println("== PASOS DE KRUSKAL ==");

        while (e < V - 1 && i < edges.size()) {
            Edge next_edge = edges.get(i++);

            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);

            if (x != y) {
                result[e++] = next_edge;
                union(subsets, x, y);
                System.out.println("AGREGANDO ARISTA: " + next_edge);
            } else {
                System.out.println("DESCARTANDO POR CICLO: " + next_edge);
            }
        }

        System.out.println("\n== ARBOL DE RECUBRIMIENTO MINIMO ==");
        int minCost = 0;
        for (i = 0; i < e; ++i) {
            System.out.println(result[i]);
            minCost += result[i].weight;
        }
        System.out.println("COSTO TOTAL MINIMO: " + minCost);
    }
}
public class kruskal_ricardoE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO DE NODOS: ");
        int V = sc.nextInt();
        System.out.print("NUMERO DE ARISTAS: ");
        int E = sc.nextInt();

        KruskalMST g = new KruskalMST(V);

        System.out.println("INGRESA LAS ARISTAS COMO: ORIGEN DESTINO PESO");
        for (int i = 0; i < E; ++i) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int peso = sc.nextInt();
            g.addEdge(src, dest, peso);
        }

        g.kruskalMST();
    }
}
