import java.util.LinkedList;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        // 1. Crear varios objetos Product (constructores)
        Product p1 = new Product(1, "Manzana", 1500, 50);
        Product p2 = new Product(2, "Banano", 800, 120);
        Product p3 = new Product(3, "Tomate", 1200, 80);
        Product p4 = new Product();
        Product p5 = new Product(5, "Cebolla", 900, 60);

        // 2. Consultar y modificar atributos (get y set)
        System.out.println("Nombre de p1: " + p1.getName());
        p4.setId(4);
        p4.setName("Papa");
        p4.setPrice(1000);
        p4.setQuantity(90);
        System.out.println("p4 modificado: " + p4);

        // 3. Crear la lista enlazada
        LinkedList<Product> inventario = new LinkedList<>();

        // 4. Agregar productos (inserciones al inicio y al final)
        inventario.addLast(p1);
        inventario.addLast(p2);
        inventario.addLast(p3);
        inventario.addFirst(p4);
        inventario.addLast(p5);

        // 5. Consultar primero, último, posición y cantidad
        System.out.println("\nPrimero: " + inventario.getFirst());
        System.out.println("Último: " + inventario.getLast());
        System.out.println("Posición 2: " + inventario.get(2));
        System.out.println("Cantidad de elementos: " + inventario.size());

        // 6. Recorrer y mostrar
        System.out.println("\nInventario completo:");
        for (Product p : inventario) {
            System.out.println(p);
        }

        // 7. Buscar un producto (por nombre)
        String buscado = "Tomate";
        Product encontrado = null;
        for (Product p : inventario) {
            if (p.getName().equalsIgnoreCase(buscado)) {
                encontrado = p;
                break;
            }
        }
        System.out.println("\nBúsqueda de '" + buscado + "': "
                + (encontrado != null ? encontrado : "No encontrado"));

        // 8. Modificar información de un producto
        if (encontrado != null) {
            encontrado.setPrice(1350);
            encontrado.setQuantity(70);
            System.out.println("Producto modificado: " + encontrado);
        }

        // 9. Eliminar al inicio y al final
        Product eliminadoInicio = inventario.removeFirst();
        Product eliminadoFinal = inventario.removeLast();
        System.out.println("\nEliminado al inicio: " + eliminadoInicio);
        System.out.println("Eliminado al final: " + eliminadoFinal);

        System.out.println("\nInventario final:");
        for (Product p : inventario) {
            System.out.println(p);
        }
    }
}
