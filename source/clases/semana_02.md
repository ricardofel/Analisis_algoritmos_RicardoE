> **Autor:** *Ricardo Espinosa*
---
# Resumen de la Clase: Semana #2 - Bimestre #1

En esta clase se abordaron las **demostraciones** en algoritmia, un tema fundamental para comprender de manera rigurosa el comportamiento de los algoritmos. Se estudió cómo demostrar propiedades de algoritmos utilizando dos técnicas principales: **demostración por contradicción** y **demostración por inducción matemática**.

---

## Demostración por Contradicción

La **demostración por contradicción** consiste en:
1. **Suponer lo contrario** de lo que queremos demostrar.
2. **Llegar a una contradicción lógica** a partir de esa suposición.
3. **Concluir que la suposición es falsa**, por lo tanto, la afirmación original es verdadera.

Esta técnica es poderosa porque a veces es más sencillo probar que "lo contrario no puede ser cierto" que construir directamente una demostración.

**Ejemplo sencillo:**  
Supongamos que afirmamos que "un algoritmo termina siempre".  
- Suponemos lo contrario: "el algoritmo **no termina**".
- Mostramos que eso lleva a un absurdo (por ejemplo, excede límites físicos o rompe reglas básicas).
- Concluimos que el algoritmo **sí termina**.

---

## Demostración por Inducción Matemática

La **inducción matemática** es otra herramienta poderosa, especialmente útil cuando trabajamos con algoritmos que involucran estructuras repetitivas o recursivas.  
Esta técnica sigue tres pasos fundamentales:

1. **Caso base**:  
   Demostrar que la propiedad se cumple para un valor inicial, generalmente el más pequeño (por ejemplo, \(n=1\)).

2. **Hipótesis de inducción**:  
   Suponer que la propiedad es verdadera para un valor arbitrario \(n = k\).

3. **Paso inductivo (Demostración)**:  
   Usar la hipótesis para demostrar que también se cumple para \(n = k+1\).

**Si estos tres pasos se cumplen**, entonces se concluye que la propiedad es verdadera para todos los valores válidos de \(n\).

**Ejemplo típico:**  
Probar que un algoritmo que suma los primeros \(n\) números naturales produce la suma correcta.

---

## ¿Cuándo se considera eficiente un algoritmo?

Durante la clase también se destacó la importancia de reconocer **cuándo un algoritmo es eficiente**.  
Un algoritmo se considera **eficiente** si:
- Su tiempo de ejecución crece razonablemente respecto al tamaño de la entrada.
- Utiliza una cantidad de memoria adecuada.

Un algoritmo eficiennte resuelve el problema mas rapido, lo cual es crucial cuando:
- El tamaño de los datos es muy grande.
- Se requiere una respuesta en tiempo real (como en videojuegos, transacciones bancarias, navegacion GPS, etc).
- El sistema tiene recursos limitados o muchos usuarios simultaneos.