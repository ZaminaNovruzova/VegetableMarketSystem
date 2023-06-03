import java.util.Scanner;

public class Tomato implements Vegetable {
    private double price = 1.3;

    Scanner scanner1 = new Scanner(System.in);
    private double kg = scanner1.nextInt();


    public double getPrice() {
        return price;
    }

    @Override
    public void vegetableName() {

    }

    @Override
    public void receivedKg() {

    }

    @Override
    public double price() {
        return kg * price;
    }
}
