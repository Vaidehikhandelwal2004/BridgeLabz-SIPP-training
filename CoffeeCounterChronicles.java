import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeeType;
        
        while (true) {
            System.out.print("\nEnter coffee type (espresso/latte/cappuccino/mocha/exit): ");
            coffeeType = sc.nextLine().toLowerCase();

            if (coffeeType.equals("exit")) {
                System.out.println("Exiting... Thank you for visiting!");
                break;
            }

            int price = 0;
            
            switch (coffeeType) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                    case "mocha":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            int total = price * quantity;
            double gst = total * 0.18;
            double finalAmount = total + gst;

            System.out.println("Base amount [in Rupees]: " + total);
            System.out.println("GST (18%) [in Rupees] :  " + gst);
            System.out.println("Total bill [in Rupees]: " + finalAmount);
        }

        sc.close();
    }
}

