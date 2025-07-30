package project.main;

public class Customer {
    protected String name;
    protected double phoneNumber;
    public Customer(String name,double phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public void displayInfo(){
        System.out.println("The name of the customer is "+name);
        System.out.println("The phone number of the customer is "+phoneNumber);
    }
}
