package javabasecource.lefthandrectanglesquare;

import java.util.function.DoubleUnaryOperator;

/**
 * Created by andrew on 13.01.17.
 */
public class SquareCounter {
    public double countSquareWithFunction(DoubleUnaryOperator function, double a, double b){
        double accuracy = 1e8;
        double h = (b - a) / accuracy;
        double s = 0;
        for (int i = 0; i < accuracy; i++){
            s += function.applyAsDouble(a + h * (i + 0.5));
        }
        return s * h;
    }
}
