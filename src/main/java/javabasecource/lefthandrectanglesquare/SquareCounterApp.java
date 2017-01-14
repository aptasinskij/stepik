package javabasecource.lefthandrectanglesquare;

/**
 * Created by andrew on 13.01.17.
 */
public class SquareCounterApp {
    public static void main(String[] args) {
        SquareCounter counter = new SquareCounter();
        System.out.println(Double.toString(counter.countSquareWithFunction(x -> x + 2, 0, 10)));
    }
}
