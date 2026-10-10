import java.util.Scanner;

public class InventoryApp {
    // Permite leer datos del usuario
    private Scanner sc = new Scanner(System.in);
    // Objeto que administra el inventario
    private Inventory inventory;

    // Método principal
    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        app.init();
    }

    public void init(){
        inventory = new Inventory();
        int op;
        do {
            System.out.println("\n\t MENU");
            System.out.println("----MANEJO DE INVENTARIOS----");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar existencia");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Consultar producto");
            System.out.println("6. Mostrar productos");
            System.out.println("7. Salir");
            System.out.println("\nSeleccione una opcion");
            
            op = sc.nextInt();
            
            switch (op) {
                case 1:
                    newProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    printProduct();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (op != 7);
    }

    // Opcion 1 = Nuevo producto (solicita categoría)
    private void newProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto:");
        String name = sc.next();

        System.out.println("Existencia inicial:");
        int existence = sc.nextInt();

        System.out.println("Precio del producto:");
        double price = sc.nextDouble();

        System.out.println("Categoría del producto:");
        String category = sc.next();

        inventory.newProduct(ID, name, existence, price, category);
    }

    // Opcion 2 = Agregar existencia
    private void addProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();
        inventory.addProduct(ID);
    }

    // Opcion 3 = Eliminar producto
    private void deleteProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();
        inventory.deleteProduct(ID);
    }

    // Opcion 4 = Actualizar precio
    private void updateProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nuevo precio:");
        double price = sc.nextDouble();

        inventory.updateProduct(ID, price);
    }

    // Opcion 5 = Consultar producto por ID
    private void searchProduct(){
        System.out.println("ID del producto a consultar:");
        int ID = sc.nextInt();
        inventory.searchProduct(ID);
    }

    // Opcion 6 = Mostrar productos
    private void printProduct(){
        inventory.printProduct();
    }
}
