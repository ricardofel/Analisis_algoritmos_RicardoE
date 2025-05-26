> AUTOR: Ricardo Fabian Espinosa Largo
# Tarea 4: Resolver recurrencias

### Ejercicio 1
![ejercicio1](../../recursos/tarea4_recurrencia1.png)
### Solución
![solucion1](../../recursos/tarea4_solucion1.png)

---
### Ejercicio 2
![ejercicio2](../../recursos/tarea4_ejercicio2.png)
### Solución
## 1. Codificar el algoritmo de Fibonacci en Java

A continuación se presenta una versión recursiva del algoritmo de Fibonacci en Java:

```java
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <= n; i++) {
            System.out.println("F(" + i + ") = " + fibonacci(i));
        }
    }
}
```

---

## 2. Identificar la recurrencia

El algoritmo llama a la función `fibonacci(n-1)` y `fibonacci(n-2)`. Por lo tanto, el tiempo de ejecución \( T(n) \) está definido por la siguiente **relación de recurrencia**:

\[
T(n) = T(n - 1) + T(n - 2) + c
\]

Donde \( c \) es una constante que representa las operaciones básicas realizadas en cada llamada.

---

## 3. Prueba de escritorio

| n  | Llamadas Totales \( T(n) \) |
|----|------------------------------|
| 0  | 1                            |
| 1  | 1                            |
| 2  | 3                            |
| 3  | 5                            |
| 4  | 9                            |
| 5  | 15                           |
| 6  | 25                           |
| 7  | 41                           |
| 8  | 67                           |

Este crecimiento se asemeja al de una **sucesión de Fibonacci**, pero no exactamente: crece **exponencialmente**.

---

## 4. Ecuación general (Estimación)

La relación de recurrencia:

\[
T(n) = T(n-1) + T(n-2) + c
\]

Tiene una solución aproximada de orden **exponencial**. Ignorando la constante, se sabe que:

\[
T(n) = \Theta(\phi^n)
\]

Donde \( \phi \approx 1.618 \) es el número áureo, raíz positiva de la ecuación \( x^2 = x + 1 \).

---


## Conclusión

El algoritmo de Fibonacci recursivo tiene una **complejidad exponencial**:  
\[
T(n) = O(\phi^n)
\]  
Esto lo hace ineficiente para valores grandes de `n` debido al gran número de llamadas recursivas redundantes.