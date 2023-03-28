package Product;

public class Cosmetics extends Product{
    private String color="red";
    private double weight=0.2;

    public Cosmetics(){

        super(234,"Lipstick","small",4);
    }



    public String getColor() {
        return color;
    }

    public double getWeight() {

        return weight;
    }

}
