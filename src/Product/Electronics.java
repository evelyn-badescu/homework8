package Product;

public class Electronics extends Product{
    private String type="Gadget";
    private double length=1.2;
    private double height=0.3;
    private double weight=0.6;

    public Electronics(int price,String name,String description,int quantity){
        super(price, name, description, quantity);
    }


    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

}
