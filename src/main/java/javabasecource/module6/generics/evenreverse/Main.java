package javabasecource.module6.generics.evenreverse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
 * затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
 * в обратном порядке в System.out.
 * Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 * В этом задании надо написать программу целиком, включая import'ы, декларацию класса Main и метода main.
 *
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int i = 0;
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                if (i % 2 != 0){
                   integers.add(scanner.nextInt());
                    i++;
                } else {
                    scanner.next();
                    i++;
                }
            } else {
                scanner.next();
            }
        }
        scanner.close();
        ListIterator<Integer> li = integers.listIterator(integers.size());
        while(li.hasPrevious()) {
            System.out.printf("%d ", li.previous());
        }

    }
}
