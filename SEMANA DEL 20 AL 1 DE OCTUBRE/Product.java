import java.util.Iterator;
import java.util.LinkedList;
public class Product {
    private int ID;
    private String name;
    private int existence;
    private double price;

    public Product ( int ID, String name, int existence, double price)
    {
        this.ID = ID;
        this.name = name;
        this.existence = existence;
        this.price = price;

    }

    public Product(int ID){
        this.ID = ID;
    }

}

