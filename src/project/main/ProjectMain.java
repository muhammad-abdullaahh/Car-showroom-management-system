package project.main;
import java.util.Scanner;
public class ProjectMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Showroom showroom = new Showroom();

        while (true) {
            System.out.println("\n--- Car Showroom Menu ---");
            System.out.println("1. Add Car");
            System.out.println("2. Register Customer");
            System.out.println("3. Sell Car");
            System.out.println("4. Display All Cars");
            System.out.println("5. Display All Customers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter car model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter car brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Is the car available? (Yes/No): ");
                    String availability = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    Car car = new Car(model, brand, availability, price);
                    showroom.addCar(car);
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    double phone = scanner.nextDouble();
                    Customer customer = new Customer(name, phone);
                    showroom.registerCustomer(customer);
                    break;

                case 3:
                    System.out.print("Enter car model to sell: ");
                    String sellModel = scanner.nextLine();
                    System.out.print("Enter customer name: ");
                    String custName = scanner.nextLine();
                    for (Car c : showroom.listOfCars) {
                        if (c.model.equalsIgnoreCase(sellModel)) {
                            showroom.sellCar(c, custName);
                            break;
                        }
                    }
                    break;

                case 4:
                    showroom.displayCars();
                    break;

                case 5:
                    showroom.displayCustomer();
                    break;

                case 0:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}