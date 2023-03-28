package Product;

public class Product {
    protected int price;
    protected String name;
    protected String description;
    protected int quantity;



    public Product(int price,String name,String description,int quantity){
        this.price=price;
        this.name=name;
        this.description=description;
        this.quantity=quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

}
