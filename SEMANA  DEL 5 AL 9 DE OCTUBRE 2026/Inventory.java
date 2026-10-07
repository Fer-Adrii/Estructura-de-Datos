import java.util.LinkedList;

public class Inventory {
    // Lista donde se guardan los productos
    private LinkedList<Product> products;
    
    //Constructor: crea la lista vacía
    public Inventory () {
        products = new LinkedList<>();
    }

    //AGREGAR UN PRODUCTO NUEVO
    public void newProduct (int ID, String name, int existence, double price) {
        // Crea un nuevo objeto Product
        Product newProduct = new Product (ID, name, existence, price);
        
        // Agrega el producto a la lista
        boolean success = products.add(newProduct);
        
        // Informa si se agregó correctamente
        if (success) {
            System.out.println(
                "El producto " + name + 
                " se añadió satisfactoriamente"
            );
        } else {
            System.out.println("Ocurrio un problema al agregar el producto");
        }
    }

    //AUMENTAR LA EXISTENCIA DE UN PRODUCTO
    public void addProduct (int ID) {
        //Busca la posición del producto por su ID
        int productIndex = products.indexOf (new Product (ID) ) ;
        // Obtiene el producto encontrado
        Product product = products.get (productIndex) ;
        // Consulta la existencia actual
        int existenceTemp = product.getExistence () ;
        // Aumenta la existencia en una unidad
        int newExistence = existenceTemp + 1;
        // Guarda la nueva existencia
        product.setExistence (newExistence) ;
        System.out.println ("\nSe agrego una unidad de "+ product.getName ());
    }
    
    //  MOSTRAR TODOS LOS PRODUCTOS
    public void printProduct() {
        System.out.println ("PRODUCTOS EN EL ALMACEN") ;
        // Recorre e imprime la lista
        products.forEach (System.out::println) ;
        System.out.println();
    }

    //Actualizar precio
    public void updateProduct(int ID, double price){
        //Busca la posicion usando el ID
        int productIndex = products.indexOf(new Product(ID));
        //Obtiene el producto encontrado
        Product product = products.get(productIndex);
        //Cambia el precio
        product.setPrice(price);
        System.out.println("\nPrecio actualizado correctamente");
    }

    //Eliminar un producto
    public void deleteProduct(int ID){
        //Buscala posicion usando el ID
        int productIndex = products.indexOf(new Product(ID));
        //Elimina y guarda el producto eliminado
        Product deleteProduct = products.remove(productIndex);

        //Verifica si se elimino
        if (deleteProduct != null){
            System.out.println("El producto "+ deleteProduct+ " se elimino");
        }
        else{
            System.out.println("El producto NO se elimino");
        }
    }
}
