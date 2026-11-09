import java.util.PriorityQueue;

public class PrioridadPalabras {

    public static void main(String[] args) {

        PriorityQueue<String> cola = new PriorityQueue<>();

        // TODO 1: Mete con offer() 4 palabras: tu nombre, tu ciudad,
        //         tu carrera y tu lenguaje de programación favorito.
        //         Luego imprime la cola completa con System.out.println(cola);
        cola.offer("Adrian");
        cola.offer("Bogota");
        cola.offer("Tecnologia en Informatica");
        cola.offer("Python");
        
        System.out.println("Cola completa: " + cola + "\n");


        // TODO 2: ANTES de ejecutar, escribe aquí en un comentario
        //         cuál crees que será la cabeza. Luego imprímela con peek().
        //         Mi predicción: "Adrian" (porque en Java las PriorityQueue con Strings 
        //         ordenan alfabéticamente de forma ascendente, y la 'A' es la primera).
        System.out.println("Cabeza (prediccion: Adrian): " + cola.peek() + "\n");


        // TODO 3: Vacía la cola con isEmpty() y poll(), imprimiendo cada palabra.
        System.out.println("Vaciando la cola por orden de prioridad (alfabetico):");
        while (!cola.isEmpty()) {
            String palabra = cola.poll();
            System.out.println("Se saco: " + palabra);
        }

    }
}