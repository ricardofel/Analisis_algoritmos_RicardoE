> **Autor:** *Ricardo Espinosa*
---
# Resumen de la Clase: Semana #6 - Bimestre #1

## Tema: Estructuras de control

En esta clase nos enfocamos en **traducir ciclos repetitivos de algoritmos a expresiones matemáticas**, especialmente usando **sumatorias** para poder analizar el tiempo de ejecución con mayor precisión.

---

### Estructuras de control secuenciales

Empezamos repasando las **estructuras secuenciales**, donde las instrucciones se ejecutan una tras otra en el mismo orden en que están escritas. Estas no requieren condiciones ni decisiones, y forman la base para construir estructuras más complejas como los ciclos.

---

### Análisis de bucles: ejemplo con `for`

Se analizaron varios ejemplos de ciclos `for` en Java y pseudocódigo, identificando cuántas veces se ejecuta cada línea. A partir de ahí, se asociaron sumatorias simples y se introdujo el análisis **completo** del costo de ejecución de un bloque de código, sumando los costos de cada iteración. También se mostraron formas de expresar estos costos de forma matemática y se obtuvo, por ejemplo, que un ciclo como:

```java
for (int i = 1; i <= n; i++) {
  x = x * 2;
}
```
Tiene un tiempo de ejecución:  t(n)=n

### Bucles mas complejos
Tambien analizamos casos en los que habian bucles anidados y vimos como debemos combinar las sumatorias para poder obtener la expresion.

### Ejercicios practicos
> Se realizaron dos ejercicios haciendo la prueba de escritorio a dos algoritmos y luego analizando las iteraciones para segun eso sacar expresiones matematicas.

> Estos dos ejercicios **contaron como tarea** y para ver su resolucion adjunto el enlace correspondiente: **[tarea 3](../tareas/tarea_3/estrcuturas_repetitivas.md)**