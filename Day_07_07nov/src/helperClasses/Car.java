package helperClasses;

public class Car {
    private String model;
    private double price;

    public Car(String model){
        this.model = model;
        System.out.println("Model selected is : " + model);
    }

    public Car(String model, double price){
        this.model = model;
        this.price = price;
        System.out.println("Name of model is : " + model + " and the price of the car is : Rs " + price);
    }
}
