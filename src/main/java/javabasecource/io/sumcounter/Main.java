package javabasecource.io.sumcounter;

import java.util.Scanner;

/**
 * Created by andrew on 23.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) sum += scanner.nextDouble();
            else scanner.next();
        }
        System.out.printf("%.6f", sum);
        scanner.close();
    }
}
