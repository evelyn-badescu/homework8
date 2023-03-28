package Product;

public class Main {
    public static void main(String[] args){
        Product product=new Product(23,"Pan","black",0);
        System.out.println("The product name is : "+product.getName()+" and its price is : "+product.getPrice());
        System.out.println("It can be described as: "+product.getDescription()+" and the quantity wanted is: "+product.getQuantity());

        Cosmetics cosmetics=new Cosmetics();
        System.out.println("The cosmetics name is : "+cosmetics.getName()+" and its price is : "+cosmetics.getPrice());
        System.out.println("It can be described as: "+cosmetics.getDescription()+" and the quantity wanted is: "+cosmetics.getQuantity());
        System.out.println("The color of the cosmetic is: "+cosmetics.getColor()+" and its weight is: "+cosmetics.getWeight());

        Electronics electronics=new Electronics(3455,"Laptop","small",3);
        System.out.println("The electronics name is : "+electronics.getName()+" and its price is : "+electronics.getPrice());
        System.out.println("It can be described as: "+electronics.getDescription()+" and the quantity wanted is: "+electronics.getQuantity());
        System.out.println("The length of the electronics is: "+electronics.getLength()+" and its height is: "+electronics.getHeight());
        System.out.println("The type of the electronics is: "+electronics.getType()+" and its weight is: "+electronics.getWeight());

        Fridge fridge=new Fridge(456,"Fridge","tall",1,-20);
        System.out.println("The name is : "+fridge.getName()+" and its price is : "+fridge.getPrice());
        System.out.println("The temperature inside is : "+fridge.getTemperature());




    }
}
