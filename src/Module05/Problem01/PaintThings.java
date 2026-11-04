package Module05.Problem01;

import Module05.Problem01.Shapes.Cylinder;
import Module05.Problem01.Shapes.Rectangle;
import Module05.Problem01.Shapes.Sphere;

import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        double deckAmt, bigBallAmt, tankAmt;

        deck = new Rectangle(20, 30);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        deckAmt = paint.amount(deck);
        bigBallAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("deck " + fmt.format(deckAmt));
        System.out.println("bigBall " + fmt.format(bigBallAmt));
        System.out.println("tank " + fmt.format(tankAmt));
    }
}