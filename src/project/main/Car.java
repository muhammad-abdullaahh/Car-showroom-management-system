package project.main;

public class Car {
    private String model,brand;
    private double price;
    public String isAvailable;
    public Car(String model,String brand,String isAvailable,double price){
        this.model=model;
        this.brand=brand;
        this.isAvailable=isAvailable;
        this.price=price;
    }
    public void displayInfo(){
        System.out.println("The brand of the car is "+brand);
        System.out.println("The model of the car is "+model);
        System.out.println("The price of the car is "+price);
        System.out.println("Is the car available ? : "+isAvailable);
    }
}
