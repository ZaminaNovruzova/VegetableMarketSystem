import java.util.Scanner;

public class Garlic implements Vegetable{
    private double price=0.90;

    public double getPrice() {
        return price;
    }
    Scanner scanner=new Scanner(System.in);
    private double kg=scanner.nextInt();

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
