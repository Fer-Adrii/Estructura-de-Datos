public class Product {
    // Atributos del producto
    private int ID;
    private String name;
    private int existence;
    private double price;
    private String category; // Nuevo atributo de categoría

    // Constructor para buscar por ID
    public Product (int ID) {
        this.ID = ID;
    }

    // Constructor para crear un producto completo (incluyendo categoría)
    public Product (int ID, String name, int existence, double price, String category) {
        this.ID = ID;
        this.name = name;
        this.existence = existence;
        this.price = price;
        this.category = category;
    }
    
    // GET: permiten consultar los datos
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getExistence() {
        return existence;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }

    // SET: permiten modificar los datos
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setExistence(int existence) {
        this.existence = existence;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        Product other = (Product) obj;
        return this.ID == other.ID;
    }

    // Permite mostrar los datos del producto (incluyendo la categoría)
    @Override
    public String toString() {
        return "Product {" +
                "ID=" + ID +
                ", name=" + name +
                ", existence=" + existence +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
