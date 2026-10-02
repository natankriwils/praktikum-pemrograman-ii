package Module02.Problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Fruit apple = new Fruit("Apple", 0.4, 7000.0, 40.0);
        Fruit mango = new Fruit("Mango", 0.2, 3500.0, 15.0);
        Fruit avocado = new Fruit("Avocado", 0.25, 10000.0, 12.0);

        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}