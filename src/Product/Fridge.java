package Product;

public class Fridge extends Electronics{
    private double temperature;

    public Fridge(int price,String name,String description,int quantity,double temperature){
        super(price,name,description,quantity);
        this.temperature=temperature;

    }

    public double getTemperature() {

        return temperature;
    }

}
