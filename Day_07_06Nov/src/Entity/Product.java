package Entity;

import customeException.InvalidAmountException;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) throws InvalidAmountException {
        if (price < 0) {
            throw new InvalidAmountException("Price cannot be negative for product: " + name);
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}

