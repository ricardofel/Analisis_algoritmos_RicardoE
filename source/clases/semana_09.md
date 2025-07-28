> **Autor:** *Ricardo Espinosa*
---
# Resumen de la Clase: Semana #9 - Bimestre #2

# Árboles de Recubrimiento Mínimo y Algoritmo de Kruskal

## Introducción a los Árboles de Recubrimiento Mínimo

Un **árbol de recubrimiento mínimo** es una estructura fundamental cuando trabajamos con grafos no dirigidos y ponderados. Imagina que tienes un conjunto de ciudades conectadas por carreteras y quieres conectar todas las ciudades gastando la menor cantidad posible en la construcción de carreteras. El árbol de recubrimiento mínimo (o *Minimum Spanning Tree*, MST) es justo lo que necesitas: selecciona las conexiones (aristas) suficientes para unir todos los nodos, pero con el menor costo total, sin ciclos.

### ¿Para qué sirve?

* Optimizar redes de transporte y telecomunicaciones.
* Reducir costos en conexiones eléctricas, tuberías, etc.
* Modelar problemas de optimización en grafos.

---

## Algoritmo de Kruskal

El **algoritmo de Kruskal** es una de las formas más sencillas y eficientes para encontrar el árbol de recubrimiento mínimo de un grafo. Se basa en ir agregando las aristas de menor peso, asegurando siempre que no se formen ciclos.

### Pasos del algoritmo de Kruskal

1. Ordenar todas las aristas del grafo de menor a mayor peso.
2. Inicializar un conjunto vacío para el árbol de recubrimiento mínimo (MST).
3. Recorrer las aristas ordenadas y agregar cada una al MST solo si NO forma un ciclo con las aristas ya seleccionadas.
4. Repetir hasta que el MST tenga exactamente (n-1) aristas, donde n es el número de nodos.

### Ejemplo en pseudocódigo

```plaintext
// Estructura de arista: (peso, nodo1, nodo2)
Entrada: lista_aristas, lista_nodos

// Inicializar cada nodo como su propio grupo
Para cada nodo en lista_nodos:
    grupo[nodo] = nodo

MST = conjunto vacío

// Ordenar las aristas por peso (de menor a mayor)
Ordenar(lista_aristas)

Para cada arista en lista_aristas:
    (peso, u, v) = arista
    Si grupo[u] != grupo[v]:
        // Agregar arista al MST
        Agregar arista a MST
        // Unir los grupos
        antiguo = grupo[v]
        Para cada nodo en lista_nodos:
            Si grupo[nodo] == antiguo:
                grupo[nodo] = grupo[u]

    Si tamaño(MST) == número_nodos - 1:
        Salir del ciclo

// Al final, MST contiene las aristas del árbol de recubrimiento mínimo

// Comentarios:
// - Se usan grupos para evitar ciclos. Solo se une si los nodos no están ya conectados.
// - El algoritmo termina cuando se han unido todos los nodos con el menor costo posible.
```

### Explicación del ejemplo

* **Ordena las aristas:** Así se garantiza que siempre se elija la conexión más barata disponible.
* **Evita ciclos:** Solo une nodos que aún no están conectados en el mismo grupo.
* **Actualiza los grupos:** Cada vez que se une una arista, se actualizan los grupos para reflejar la nueva conexión.
* **Termina cuando conecta todos los nodos:** El proceso se detiene cuando el MST tiene n-1 aristas.

---

## Resumen

El algoritmo de Kruskal es directo, eficiente y muy útil cuando las aristas ya están ordenadas o el grafo es muy disperso. Permite encontrar la manera más económica de conectar todos los puntos en una red.