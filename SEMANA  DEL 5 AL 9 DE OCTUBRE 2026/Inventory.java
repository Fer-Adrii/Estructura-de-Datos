//importar LinkedList

public class Inventory {
    // Lista donde se guardan los productos
    private List<Product> products;
    //Constructor: crea la lista vacía
    public Inventory () {
        products = new LinkedList<>();
    }

    //AGREGAR UN PRODUCTO NUEVO
    
    public void newProduct (int ID, String name, int existence, double price) {
    // Crea un nuevo objeto Product
        Product newProduct = new Product (ID, name, existence, price);
    
    // Agrega el producto a la lista
    boolean success = products. add (newProduct) ;
    
    // Informa si se agregó correctamente
    if (success) {
    System. out.println(
        "El producto " + name +
        " se añadió satisfactoriamente") ;
    }
    
    else {
        System. out. println ("Ocurrio un problema al agregar el producto");
    }
    
    }
}


//AUMENTAR LA EXISTENCIA DE UN PRODUCTO

    public void addProduct (int ID) {
    //Busca la posición del producto por su ID
    int productIndex = products.indexOf (new Product (ID) ) ;
    // Obtiene el producto encontrado
    Product product =products.get (productIndex) ;
    // Consulta la existencia actual
    int existenceTemp =product.getExistence () ;
    // Aumenta la existencia en una unidad
    int newExistence = existenceTemp + 1;
    // Guarda la nueva existencia
    product.setExistence (newExistence) ;
    System. out. println ("\nSe agrego una unidad de "+ product.getName ());
}
//  MOSTRAR TODOS LOS PRODUCTOS
public void printProducts () {
    System. out. println ("PRODUCTOS EN EL ALMACEN") ;
    // Recorre e imprime la lista
    products. forEach (System. out::println) ;
    System.out.println();
}
    
