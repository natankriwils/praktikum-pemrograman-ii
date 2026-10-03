package Module02.Problem01;

public class Fruit {
    private String fruitName;
    private double price;
    private double weight;
    private double purchaseTotal;
    private double pricePerKg;

    public Fruit(String fruitName, double price, double weight, double purchaseTotal) {
        this.fruitName = fruitName;
        this.price = price;
        this.weight = weight;
        this.purchaseTotal = purchaseTotal;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
        System.out.println("Fruit Name: " + this.fruitName);
        System.out.println("Weight: " + this.weight);
        System.out.println("Price: " + this.price);
        System.out.println("Purchase Total: " + this.purchaseTotal + "kg");
        System.out.printf("Pre-Discount Price: Rp%.2f\n", getPreDiscountPrice());
        System.out.printf("Total Discount: Rp%.2f\n", getDiscountTotal());
        System.out.printf("Final Price: Rp%.2f\n\n", getPostDiscountPrice());
    }

    public double getPreDiscountPrice() {
        return this.pricePerKg * this.purchaseTotal;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.purchaseTotal / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
