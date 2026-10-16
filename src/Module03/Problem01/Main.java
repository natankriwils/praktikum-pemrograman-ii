package Module03.Problem01;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfDice = Integer.parseInt(input.nextLine());

        LinkedList<Dice> diceRolls = new LinkedList<>();

        int total = 0;

        for (int i = 0; i < numberOfDice; i++) {
            diceRolls.add(new Dice());

            int number = diceRolls.get(i).getNumber();

            System.out.println(
                    "Dadu ke-" + (i + 1) + " bernilai " + number
            );

            total += number;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);

        input.close();
    }
}