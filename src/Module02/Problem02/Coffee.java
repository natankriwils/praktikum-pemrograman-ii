package Module02.Problem02;

import java.util.Locale;

public class Coffee {
    private String name;
    private String size;
    private double price;
    private String customer;

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Coffee Name: " + name);
        System.out.println("Size: " + size);
        System.out.println("Price: Rp. " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTax() {
        return price * 0.11;
    }
}