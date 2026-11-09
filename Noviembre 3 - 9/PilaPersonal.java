import java.util.Stack;

public class PilaPersonal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        pila.push(10); // Reemplaza 10 con tu número de lista
        imprimirPila(pila);
        
        pila.push(22); // Reemplaza 22 con tu día de cumpleaños
        imprimirPila(pila);
        
        pila.push(4);  // Reemplaza 4 con tu mes de cumpleaños
        imprimirPila(pila);

        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        int posicion = pila.search(10); // Busca el número de lista (el primer valor ingresado)
        System.out.println("El numero de lista esta en la posicion (desde la cima): " + posicion + "\n");

        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        while (!pila.empty()) {
            int elementoSacado = pila.pop();
            System.out.println("Se saco " + elementoSacado);
            imprimirPila(pila);
        }

    }

    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}