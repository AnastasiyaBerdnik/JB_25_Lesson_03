package by.epam.tr.start;

import java.util.Scanner;

public class Line01 {

    private static int number = 0;
    private static int digit = 0;

    public static void main(String[] args) {

        Line01.readNumber();
        Line01.checkEvenNumber();
    }

    private static void readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextInt())
            number = sc.nextInt();
    }

    private static void checkEvenNumber(){
        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                System.out.println("В числе есть четная цифра.");
                return;
            }
        }
        System.out.println("В числе нет четных цифр.");
    }
}
