import java.util.Scanner;

public class InventoryApp {
    //Permite leer datos del usuario
    private Scanner sc = new Scanner(System.in);
    //Objeto que adminstra el inventario
    private Inventory inventory;

    //Metodo principal
    public static void main(String[] args) {
        InventoryApp app = new InventoryApp();
        //Inicia el programa
        app.init();
    }

    public void init(){
        // Crea el inventario 
        inventory = new Inventory();
        int op;
        //repite el menu hasta seleccionar 6
        do {
            System.out.println("\n\t MENU");
            System.out.println("----MANEJO DE INVENTARIOS----");
            System.out.println("1. Nuevo producto");
            System.out.println("2. Agregar existencia");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Actualizar precio");
            System.out.println("5. Mostrar productos");
            System.out.println("6. Salir");
            System.out.println("\nSeleccione una opcion");
            //Lee la opcion seleccionada
            op = sc.nextInt();
            //Ejecuta la opcion seleccionada
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
                    printProduct();
                    break;
            }
        } while (op != 6);
    }

    // Opcion 1 = Nuevo producto
    private void newProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        System.out.println("Nombre del producto:");
        String name = sc.next();

        System.out.println("Existencia inicial");
        int existence = sc.nextInt();

        System.out.println("Precio del producto:");
        double price = sc.nextDouble();

        //Envia los datos a Inventory
        inventory.newProduct(ID, name, existence, price);
    }

    //Opcion 2 = Agregar existencia
    private void addProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        //Inventory aumenta la existencia
        inventory.addProduct(ID);
    }

    //Opcion 3 = Eliminar producto
    private void deleteProduct(){
        System.out.println("ID del producto:");
        int ID = sc.nextInt();

        //Inventory elimina el producto
        inventory.deleteProduct(ID);
    }

    //Opcion 4 = Actualizar precio
    private void updateProduct(){
        System.out.println("ID del producto");
        int ID = sc.nextInt();

        System.out.println("Nuevo precio");
        double price = sc.nextDouble();

        //Inventory modifica el precio
        inventory.updateProduct(ID, price);
    }

    private void printProduct(){
        //Inventory muestra la lista
        inventory.printProduct();
    }
}
