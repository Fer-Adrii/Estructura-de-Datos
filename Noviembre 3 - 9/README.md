# Práctica de pilas y colas

**Nombre:** Adrián Ferney Martínez García  
**Número de lista:** 10 (creo) 

## Ejercicio 1: Pila
Salida de la consola:
```
Cima: 10
Contenido: [10]  <- la cima es el de la derecha

Cima: 22
Contenido: [10, 22]  <- la cima es el de la derecha

Cima: 4
Contenido: [10, 22, 4]  <- la cima es el de la derecha

El numero de lista esta en la posicion (desde la cima): 3

Se saco 4
Cima: 22
Contenido: [10, 22]  <- la cima es el de la derecha

Se saco 22
Cima: 10
Contenido: [10]  <- la cima es el de la derecha

Se saco 10
La pila esta vacia
```
¿Por qué tu número de lista está en la posición 3?

Porque en la clase Stack de Java, el método search() cuenta las posiciones empezando desde la cima (el último elemento ingresado) con valor 1. Como el número de lista fue el primer elemento en agregarse (quedando al fondo), hay tres elementos de distancia contando desde la cima hasta él.

¿Qué pasaría con while(true)?

Si se usa un bucle while(true) sin una condición de parada, el programa entraría en un ciclo infinito intentando extraer elementos cuando la pila ya esté vacía, lo que eventualmente provocaría una excepción de tipo EmptyStackException.

### Ejercicio 2: Cola
Salida de la consola:

```
Tamano: 1
Cabeza: 10
Contenido: [10]  <- la cabeza es el de la izquierda

Tamano: 2
Cabeza: 10
Contenido: [10, 22]  <- la cabeza es el de la izquierda

Tamano: 3
Cabeza: 10
Contenido: [10, 22, 4]  <- la cabeza es el de la izquierda

Se atendio 10

Tamano: 2
Cabeza: 22
Contenido: [22, 4]  <- la cabeza es el de la izquierda

Se atendio 22
Tamano: 1
Cabeza: 4
Contenido: [4]  <- la cabeza es el de la izquierda

Se atendio 4
La cola esta vacia
```
¿Por qué la cabeza siempre es la misma?

Porque la cola sigue el principio FIFO (First In, First Out). El primer elemento en entrar (10) se mantiene al frente de la fila y no cambia hasta que se ejecuta el método poll() para atenderlo y sacarlo.

¿Por qué la pila y la cola sacaron los datos en orden contrario?

Porque la Pila (Stack) opera bajo el principio LIFO (Last In, First Out), sacando primero al último elemento ingresado; mientras que la Cola (Queue) opera bajo el principio FIFO (First In, First Out), atendiendo primero al elemento que llegó primero.

¿add u offer para el banco? ¿Por qué?

Es mejor usar offer(). Ambos métodos agregan elementos a la cola, pero add() lanza una excepción si la cola tiene una capacidad restringida y está llena, mientras que offer() retorna false de manera segura, evitando interrupciones inesperadas en el sistema del banco.

### Ejercicio 3: Cola de prioridad
Salida de la consola:

```
Cola completa: [Adrian, Bogota, Tecnologia en Informatica, Python]

Cabeza (prediccion: Adrian): Adrian

Vaciando la cola por orden de prioridad (alfabetico):
Se saco: Adrian
Se saco: Bogota
Se saco: Tecnologia en Informatica
Se saco: Python
```
¿Acertaste tu predicción?

Sí, la cabeza fue "Adrian" porque una PriorityQueue de cadenas de texto organiza los elementos alfabéticamente por defecto, y la letra 'A' ocupa la primera posición en el orden lexicográfico.

¿Por qué println salió desordenado y poll en orden?

Porque el método toString() de una PriorityQueue imprime la estructura interna del árbol binario que utiliza para gestionar la prioridad (la cual no se almacena de forma lineal). En contraste, cuando se extraen los elementos uno a uno mediante poll(), la cola evalúa y extrae rigurosamente el elemento de mayor prioridad disponible en cada paso.

## Ejercicio 4: Sala de emergencias
Salida de la consola:

```
Juan - gravedad 1
Juan (Leve)

Orden de llegada: [Juan (Leve), Raquel (Grave), Ignacio (Moderada), Omar (Muy grave), Beatriz (Grave), Xochilt (Leve)]

Paciente mas urgente: Omar (Muy grave)

Atendiendo a: Omar (Muy grave)
Atendiendo a: Raquel (Grave)
Atendiendo a: Beatriz (Grave)
Atendiendo a: Ignacio (Moderada)
Atendiendo a: Juan (Leve)
Atendiendo a: Xochilt (Leve)

Ultimo paciente atendido: Xochilt (Leve)
Total atendidos: 6
```
¿Por qué falló en el paso 4 y no con String?

Falló con una excepción ClassCastException porque la PriorityQueue necesita comparar los elementos para ordenarlos automáticamente. Los objetos String ya implementan nativamente la interfaz Comparable, pero nuestros objetos personalizados Paciente requerían implementar explícitamente Comparable<Paciente> y definir la lógica de comparación en el método compareTo().

Reto: ¿cómo harías que se respete el orden de llegada?

Para respetar el orden de llegada en situaciones de empate por gravedad, se le añadiría un atributo adicional a la clase Paciente que almacene el orden de llegada (por ejemplo, un contador incremental o idLlegada). Luego, en el método compareTo(), si las gravedades de dos pacientes resultan ser exactamente iguales, se evaluaría ese identificador para priorizar al paciente que llegó primero (orden ascendente).
