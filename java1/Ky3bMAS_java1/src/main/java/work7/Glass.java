package work7;

public class Glass extends Dish{
    public Glass(double price, String name) {
        super(price, name);
    }

    public void Drink(){
        System.out.println("Drink from glass");
    }
}
