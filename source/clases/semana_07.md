> **Autor:** *Ricardo Espinosa*
---
# Resumen de la Clase: Semana #7 - Bimestre #1

# Recurrencias en Análisis de Algoritmos

## ¿Qué son las recurrencias?

Las **recurrencias** son expresiones que definen el tiempo de ejecución de un algoritmo en términos de sí mismo, especialmente útiles para analizar algoritmos **recursivos**. En lugar de expresar directamente el tiempo que tarda un algoritmo, se define cómo ese tiempo depende del tiempo necesario para resolver instancias más pequeñas del mismo problema.

Por ejemplo:  
- El factorial de un número `n!` puede expresarse como `n * (n - 1)!`, lo que es una recurrencia.

## Utilidad de las recurrencias

Las **ecuaciones de recurrencia** son herramientas clave para determinar cotas asintóticas, es decir, la eficiencia del algoritmo expresada en notación Big-O. Nos permiten entender cuántas operaciones se requieren según el tamaño de entrada `n`.

## Métodos para resolver recurrencias

### 1. Suposiciones inteligentes
Este método empírico incluye varios pasos:

1. **Calcular los primeros valores** de la recurrencia para entender el comportamiento.
2. **Buscar patrones o regularidades** en esos valores.
3. **Proponer una fórmula general** o solución tentativa.
4. **Demostrar por inducción matemática** que la fórmula funciona en todos los casos.

### 2. Ecuación característica
Utilizado comúnmente para resolver recurrencias lineales homogéneas con coeficientes constantes. Aunque no se desarrolla en profundidad en el documento, es un método formal clásico.

### Generalización (no formal pero observada)
---

### Nota: Durante la clase se realizaron algunos ejercicios, uno quedo como tarea, todos se adjuntan en **[tarea 4](../tareas/tarea_4/recurrencias.md)**