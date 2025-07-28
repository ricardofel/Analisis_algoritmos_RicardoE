> **Autor:** *Ricardo Espinosa*
---
# Resumen de la Clase: Semana #15 - Bimestre #2
# Algoritmos Aleatorios y Pseudoaleatorios

## Introducción

En la semana 15 se abordaron los **algoritmos aleatorios y pseudoaleatorios**, herramientas fundamentales en el análisis de algoritmos y en muchas aplicaciones prácticas, desde simulaciones hasta criptografía y algoritmos probabilistas.

---

## ¿Qué es un algoritmo aleatorio?

Un **algoritmo aleatorio** (o probabilista) es aquel que toma decisiones internas usando algún tipo de fuente de aleatoriedad. Esto significa que puede ofrecer distintos resultados aunque se ejecute varias veces con los mismos datos de entrada. Estos algoritmos se usan cuando una solución determinista es muy costosa o compleja, o cuando se quiere obtener buenos resultados en promedio.

* Pueden tener resultados correctos solo con cierta probabilidad.
* Suelen ser más simples o rápidos que sus equivalentes deterministas en muchos casos prácticos.

---

## Números pseudoaleatorios

Como en los computadores no existe la verdadera aleatoriedad, se utilizan **números pseudoaleatorios**, que son secuencias generadas por algoritmos que simulan el azar pero que en realidad son totalmente deterministas. Son útiles porque cumplen propiedades estadísticas similares a la aleatoriedad real.

---

## Generador lineal congruencial

Uno de los métodos más usados para generar números pseudoaleatorios es el **generador lineal congruencial**. Este algoritmo produce una secuencia de números que parecen aleatorios, a partir de una fórmula matemática y una semilla inicial.

**Fórmula básica:**

```
X_{n+1} = (a * X_n + c) mod m
```

* `X_n` es el número generado en la iteración anterior (la semilla inicial si es la primera vez).
* `a`, `c`, y `m` son constantes enteras elegidas cuidadosamente para lograr buena distribución.

### Pseudocódigo simple

```plaintext
Funcion generador_lineal_congruencial(semilla, a, c, m, cantidad):
    X = semilla
    Para i desde 1 hasta cantidad:
        X = (a * X + c) mod m
        imprimir X
```

---

## Taller y ejemplos en clase

En clase se discutió cómo analizar la distribución de los números generados y se aplicó el generador lineal congruencial en ejemplos prácticos, explorando el efecto de cambiar la semilla y los parámetros. Se vio la diferencia entre aleatoriedad real y pseudoaleatoriedad, y cómo estas técnicas son útiles en algoritmos probabilistas, simulaciones y análisis de casos promedio.

---
