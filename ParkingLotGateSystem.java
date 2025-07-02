import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = 5;  // Total parking spots
        int occupied = 0;

        while (true) {
            System.out.println("\nParking Lot Menu:");
            System.out.println("1. Park");
            System.out.println("2. Exit");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Quit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Car parked. Spots left: " + (capacity - occupied));
                    } else {
                        System.out.println("Parking full!");
                    }
                    break;
                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited. Spots left: " + (capacity - occupied));
                    } else {
                        System.out.println("No cars to exit.");
                    }
                    break;
                case 3:
                    System.out.println("Occupied spots: " + occupied + "/" + capacity);
                    break;
                case 4:
                    System.out.println("Exiting Parking System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            if (occupied == capacity) {
                System.out.println("⚠ Parking is now full.");
            }
        }
    }
}
