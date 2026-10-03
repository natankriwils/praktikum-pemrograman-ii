package Module02.Problem01;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Fruit apple = new Fruit("Apple", 7000.0, 0.4, 40.0);
        Fruit mango = new Fruit("Mango", 3500.0, 0.2, 15.0);
        Fruit avocado = new Fruit("Avocado", 10000.0, 0.25, 12.0);
        apple.printInfo();
        mango.printInfo();
        avocado.printInfo();
    }
}
