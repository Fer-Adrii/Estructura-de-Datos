// Adrian Martinez - Cristian Cuervo//
class Nodo {
    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    ListaEnlazada() {
        this.cabeza = null;
    }

    void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
    }

    void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }

    void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }

    void eliminar(int valor) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.dato == valor) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null &&
               actual.siguiente.dato != valor) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }
}

public class ListaEnlazada {
    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(20);
        lista.insertarInicio(10);
        lista.insertarFinal(30);
        lista.insertarFinal(40);

        lista.insertarInicio(2);

        lista.insertarFinal(25);
        
        System.out.println("=== Lista completa ===");
        lista.mostrar();

        System.out.println("=== Eliminando el 20 ===");
        lista.eliminar(20);
        lista.mostrar();
    }
}
