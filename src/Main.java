import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ad ve kg daxil edin: ");
        String name = scanner.nextLine();
        switch (name) {
            case "tomato":
                Tomato tomato = new Tomato();
                System.out.println(tomato.price());
                break;
            case "onion":
                Onion onion = new Onion();
                System.out.println(onion.price());
                break;
            case "garlic":
                Garlic garlic = new Garlic();
                System.out.println(garlic.price());
                break;
            default:
                Exception exception = new Exception();
                exception.printStackTrace();
        }
    }
}
