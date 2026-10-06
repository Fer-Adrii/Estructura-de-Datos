// Clase que representa la estructura de datos de un Libro
class Libro {
    String codigo;
    String titulo;
    String autor;
    double precio;

    // Constructor para inicializar los atributos
    public Libro(String codigo, String titulo, String autor, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // Método para imprimir la información del libro fácilmente
    @Override
    public String toString() {
        return "Código: " + codigo + " | Título: '" + titulo + "' | Autor: " + autor + " | Precio: $" + precio;
    }
}

// Clase que representa un nodo de la lista enlazada
class Nodo {
    Libro libro;      // Almacena el objeto Libro
    Nodo siguiente;   // Puntero al siguiente nodo en la lista

    public Nodo(Libro libro) {
        this.libro = libro;
        this.siguiente = null; // Al crearse, no apunta a nada
    }
}

// Clase que gestiona las operaciones de la lista enlazada
class ListaEnlazada {
    Nodo cabeza; // Primer nodo de la lista

    public ListaEnlazada() {
        this.cabeza = null; // La lista inicia vacía
    }

    // 1. Agregar un libro al inicio de la lista
    public void agregarInicio(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        nuevoNodo.siguiente = cabeza; // El nuevo nodo apunta a la cabeza actual
        cabeza = nuevoNodo;           // La cabeza ahora es el nuevo nodo
    }

    // 1. Agregar un libro al final de la lista
    public void agregarFinal(Libro libro) {
        Nodo nuevoNodo = new Nodo(libro);
        // Si la lista está vacía, el nuevo nodo será la cabeza
        if (cabeza == null) {
            cabeza = nuevoNodo;
            return;
        }
        
        // Recorremos hasta llegar al último nodo
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nuevoNodo; // Enlazamos el último nodo con el nuevo
    }

    // 2. Determinar el tamaño de la lista
    public int obtenerTamano() {
        int contador = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // 3. Recorrer y mostrar todos los libros
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.libro.toString());
            actual = actual.siguiente;
        }
    }

    // 4. Buscar un libro (retorna el objeto Libro si lo encuentra)
    public Libro buscarLibro(String codigo) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.libro.codigo.equals(codigo)) {
                return actual.libro; // Coincidencia encontrada
            }
            actual = actual.siguiente;
        }
        return null; // No se encontró
    }

    // 5. Modificar uno de los datos del libro (en este caso, el precio)
    public boolean modificarPrecio(String codigo, double nuevoPrecio) {
        Libro libroEncontrado = buscarLibro(codigo);
        if (libroEncontrado != null) {
            libroEncontrado.precio = nuevoPrecio;
            System.out.println("-> Precio actualizado para el libro: '" + libroEncontrado.titulo + "'");
            return true;
        }
        System.out.println("-> Libro no encontrado. No se pudo modificar.");
        return false;
    }

    // 6. Eliminar elementos de la lista
    public boolean eliminarLibro(String codigo) {
        Nodo actual = cabeza;
        Nodo anterior = null;

        // Recorrer la lista buscando el código
        while (actual != null && !actual.libro.codigo.equals(codigo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        // Si llegamos al final y no lo encontramos
        if (actual == null) {
            System.out.println("-> El libro a eliminar no existe en la lista.");
            return false;
        }

        // Si el libro a eliminar es el primero (la cabeza)
        if (anterior == null) {
            cabeza = actual.siguiente;
        } else {
            // Saltamos el nodo actual para desenlazarlo de la lista
            anterior.siguiente = actual.siguiente;
        }
        
        System.out.println("-> Libro con código '" + codigo + "' eliminado correctamente.");
        return true;
    }
}

// Clase principal para ejecutar y probar el código
public class Main {
    public static void main(String[] args) {
        // Instanciar la lista
        ListaEnlazada miLista = new ListaEnlazada();

        // Crear 5 objetos de la clase Libro
        Libro libro1 = new Libro("L01", "Fundamentos de Java", "Autor A", 35.50);
        Libro libro2 = new Libro("L02", "Estructuras de Datos", "Autor B", 45.00);
        Libro libro3 = new Libro("L03", "Algoritmos Avanzados", "Autor C", 55.20);
        Libro libro4 = new Libro("L04", "Bases de Datos", "Autor D", 40.00);
        Libro libro5 = new Libro("L05", "Desarrollo Web", "Autor E", 38.00);

        // 1. Agregar libros (Inicios y finales)
        System.out.println("--- AGREGANDO LIBROS ---");
        miLista.agregarInicio(libro3); // Queda primero
        miLista.agregarInicio(libro1); // Desplaza al L03 y queda primero
        miLista.agregarFinal(libro2);  // Va al final
        miLista.agregarFinal(libro4);  // Va al final
        miLista.agregarInicio(libro5); // Desplaza a todos y queda de primero absoluto
        System.out.println("Libros agregados exitosamente.\n");

        // 2 y 3. Consultar tamaño, recorrer y mostrar
        System.out.println("--- INVENTARIO ACTUAL ---");
        System.out.println("Total de libros en la lista: " + miLista.obtenerTamano());
        miLista.mostrarLista();
        System.out.println();

        // 4. Buscar un libro
        System.out.println("--- BUSCANDO UN LIBRO ---");
        String codigoBuscar = "L03";
        Libro resultado = miLista.buscarLibro(codigoBuscar);
        if (resultado != null) {
            System.out.println("Libro encontrado: " + resultado.toString());
        } else {
            System.out.println("El libro no existe.");
        }
        System.out.println();

        // 5. Modificar un dato (precio)
        System.out.println("--- MODIFICANDO UN LIBRO ---");
        miLista.modificarPrecio("L04", 42.50); // Se actualiza el precio
        System.out.println();

        // 6. Eliminar un elemento
        System.out.println("--- ELIMINANDO UN LIBRO ---");
        miLista.eliminarLibro("L02"); // Se elimina "Estructuras de Datos"
        System.out.println();

        // Mostrar resultado final para verificar
        System.out.println("--- INVENTARIO FINAL DESPUÉS DE OPERACIONES ---");
        System.out.println("Nuevo tamaño de la lista: " + miLista.obtenerTamano());
        miLista.mostrarLista();
    }
}
