import java.util.LinkedList;
import java.util.Queue;

public class ColaPersonal {

    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        // TODO 1: Mete con offer() los MISMOS 3 datos del ejercicio 1,
        //         en el mismo orden. Después de cada offer, llama a imprimirCola(cola);
        cola.offer(10); // Número de lista
        imprimirCola(cola);
        
        cola.offer(22); // Día de cumpleaños
        imprimirCola(cola);
        
        cola.offer(4);  // Mes de cumpleaños
        imprimirCola(cola);


        // TODO 2: Atiende al primero con poll(). Guárdalo en una variable Integer,
        //         imprime "Se atendio X" y llama a imprimirCola(cola);
        Integer atendido = cola.poll();
        System.out.println("Se atendio " + atendido + "\n");
        imprimirCola(cola);


        // TODO 3: Vacía la cola de forma segura con isEmpty() y poll().
        while (!cola.isEmpty()) {
            Integer elementoAtendido = cola.poll();
            System.out.println("Se atendio " + elementoAtendido);
            imprimirCola(cola);
        }

    }

    // Este método ya está completo: muestra tamaño, cabeza y contenido
    private static void imprimirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia\n");
        } else {
            System.out.println("Tamano: " + cola.size());
            System.out.println("Cabeza: " + cola.peek());
            System.out.println("Contenido: " + cola + "  <- la cabeza es el de la izquierda\n");
        }
    }
}