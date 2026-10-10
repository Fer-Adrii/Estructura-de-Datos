import java.util.LinkedList;

public class Inventory {
    // Lista donde se guardan los productos
    private LinkedList<Product> products;
    
    // Constructor: crea la lista vacía
    public Inventory () {
        products = new LinkedList<>();
    }

    // Método auxiliar para buscar un producto por ID y retornar el objeto (o null si no existe)
    private Product findProduct(int ID) {
        int index = products.indexOf(new Product(ID));
        if (index != -1) {
            return products.get(index);
        }
        return null;
    }

    // AGREGAR UN PRODUCTO NUEVO (con categoría)
    public void newProduct (int ID, String name, int existence, double price, String category) {
        Product newProduct = new Product(ID, name, existence, price, category);
        boolean success = products.add(newProduct);
        
        if (success) {
            System.out.println("El producto " + name + " se añadió satisfactoriamente");
        } else {
            System.out.println("Ocurrio un problema al agregar el producto");
        }
    }

    // AUMENTAR LA EXISTENCIA DE UN PRODUCTO
    public void addProduct (int ID) {
        Product product = findProduct(ID);
        if (product != null) {
            int existenceTemp = product.getExistence();
            int newExistence = existenceTemp + 1;
            product.setExistence(newExistence);
            System.out.println("\nSe agrego una unidad de " + product.getName());
        } else {
            System.out.println("El producto no existe");
        }
    }
    
    // CONSULTAR UN PRODUCTO POR ID
    public void searchProduct (int ID) {
        Product product = findProduct(ID);
        if (product != null) {
            System.out.println("\nPRODUCTO ENCONTRADO:");
            System.out.println(product);
        } else {
            System.out.println("El producto no existe");
        }
    }

    // MOSTRAR TODOS LOS PRODUCTOS
    public void printProduct() {
        System.out.println("\nPRODUCTOS EN EL ALMACEN");
        products.forEach(System.out::println);
        System.out.println();
    }

    // ACTUALIZAR PRECIO
    public void updateProduct(int ID, double price){
        Product product = findProduct(ID);
        if (product != null) {
            product.setPrice(price);
            System.out.println("\nPrecio actualizado correctamente");
        } else {
            System.out.println("El producto no existe");
        }
    }

    // ELIMINAR UN PRODUCTO
    public void deleteProduct(int ID){
        Product product = findProduct(ID);
        if (product != null) {
            products.remove(product);
            System.out.println("El producto " + product + " se elimino");
        } else {
            System.out.println("El producto no existe");
        }
    }
}
