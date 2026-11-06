package Module04.Problem03;

public class Dog extends Pet {
    private String furColor;
    private String[] abilities;

    public Dog(String name, String breed, String furColor, String[] abilities) {
        super(name, breed);
        this.furColor = furColor;
        this.abilities = abilities;
    }

    public void displayDetailDog() {
        super.display();
        System.out.print("Memiliki warna bulu: " + furColor + "\n");
        System.out.print("Memiliki kemampuan: ");
        for (String dogAbilities : abilities) {
            System.out.print(dogAbilities + " ");
        }
        System.out.println();
    }
}