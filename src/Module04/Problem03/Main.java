package Module04.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan Peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();

            Cat cat = new Cat(name, breed, furColor);
            cat.displayDetailCat();
        } else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();
            System.out.print("Ras: ");
            String breed = scanner.nextLine();
            System.out.print("Warna Bulu: ");
            String furColor = scanner.nextLine();
            System.out.print("Kemampuan (pisahkan dengan koma): ");
            String[] abilities = scanner.nextLine().split(", ");

            Dog dog = new Dog(name, breed, furColor, abilities);
            dog.displayDetailDog();
        }

        scanner.close();
    }
}
