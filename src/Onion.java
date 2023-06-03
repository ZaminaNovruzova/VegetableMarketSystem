import java.util.Scanner;

public class Onion implements Vegetable{
    private double price = 0.70;

    public double getPrice() {
        return price;
    }


    Scanner scanner1 = new Scanner(System.in);
    private double kg = scanner1.nextInt();



    @Override
    public void vegetableName() {

    }

    @Override
    public void receivedKg() {

    }

    @Override
    public double price() {
        return kg*price;
    }
}
