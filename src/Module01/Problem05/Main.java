package Module01.Problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jari-jari: ");
        double r = input.nextDouble();

        System.out.print("Masukan tinggi: ");
        double t = input.nextDouble();

        final double PHI = 3.14;
        double volume = PHI * r * r * t;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f m3\n", r, t, volume);
    }
}