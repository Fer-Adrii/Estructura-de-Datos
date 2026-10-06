public class Product {
    // Atributos del producto
    private int ID;
    private String name;
    private int existence;
    private double price;
    // Constructor para buscar por ID
    public Product (int ID) {
    this. ID = ID;
    }

    // Constructor para crear un producto completo
    public Product (int ID, String name, int existence, double price) {
    this.ID = ID;
    this.name = name;
    this.existence = existence;
    this.price = price;
    }
    
    // GET: permiten consultar los datos
    public int getID() {
    return ID;
    }
    public String getName () {
    return name;
    }
    public int getExistence () {
    return existence;
    }
    public double getPrice () {
    return price;
    }
    // SET: permiten modificar los datos
    public void setID(int ID) {
    this.ID = ID;
    }

    public void setName (String name) {
    this. name = name;
    
    }
    public void setExistence (int existence) {
    this.existence = existence;
    }
    public void setPrice (double price) {
    this.price = price;
    }
    // Compara dos productos por su ID
    @Override
    public boolean equals (Object obj) {
    
    if (this == obj) {
    return true;
    }

    if (obj == null) {
    return false;
    }
    
    if (getClass() != obj.getClass ()) {
    return false;
    
    }
    
    Product other = (Product) obj;
    
    return this. ID == other. ID;
    }

    //Permite mostrar los datos del producto
    @Override
    public String toString() {
        return "Product {" +
                "ID=" + ID +
                ", name=" + name +
                ", existence=" + existence +
                ", price=" + price +
                '}';
    }

}
    
