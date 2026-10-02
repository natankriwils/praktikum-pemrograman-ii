package Module02.Problem01;

public class Fruit {
    String name;
    double weight;
    double price;
    double purchaseAmount;

    public Fruit(String name, double weight, double price, double purchaseAmount) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.purchaseAmount = purchaseAmount;
    }

    public void printInfo() {
        System.out.println("Fruit Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Purchase Amount: " + purchaseAmount + "kg");
        System.out.printf("Price Before Discount: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Discount: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Price After Discount: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return (purchaseAmount / weight) * price;
    }

    public double getDiscountTotal() {
        return (int)(purchaseAmount / 4) * (price * 4) * 0.02;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}