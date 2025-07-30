package project.main;
import java.util.ArrayList;
import java.util.List;

public class Showroom {
    private String showroomName;
    public ArrayList <Car> listOfCars = new ArrayList<>();
    public ArrayList <Customer> listOfCustomers = new ArrayList<>();
    public void addCar(Car car){
        listOfCars.add(car);
        System.out.println("Car added succesfully");
    }
    public void registerCustomer(Customer customer){
        listOfCustomers.add(customer);
        System.out.println("Customer registered succsfully");
    }
    public void sellCar(Car car, String customerName) {
    if (car.isAvailable.equalsIgnoreCase("yes")) {
        car.isAvailable = "No";
        System.out.println("Car sold to Mr./Ms. " + customerName);
        } 
         else {
        System.out.println("Car is not available at the moment.");
        }
    }
    public void displayCars() {
    System.out.println("List of all the cars available:\n");
    for (Car car : listOfCars) {
        car.displayInfo();
        System.out.println("---------------------------");
        }
    }
    public void displayCustomer() {
    System.out.println("List of all the customers:\n");
    for (Customer customer : listOfCustomers) {
        customer.displayInfo();
        System.out.println("---------------------------");
        }
    }
}
