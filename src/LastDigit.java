package by.epam.tr.start;

import java.util.Scanner;

public class LastDigit {

    private static int number = 0;
    private static int lastDigit = 0;
    private static int lastSquareDigit;

    public static void main(String[] args) {
        LastDigit.readLastDigit();
        LastDigit.getLastSquareDigit();
        LastDigit.printResult();
    }

    private static void readLastDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (sc.hasNextInt()) {
            number = sc.nextInt();
        }
        lastDigit = number % 10;
    }

    private static void getLastSquareDigit(){
        switch (lastDigit) {
            case 0:
                lastSquareDigit = 0;
                break;
            case 1:
                lastSquareDigit = 1;
                break;
            case 2:
                lastSquareDigit = 4;
                break;
            case 3:
                lastSquareDigit = 9;
                break;
            case 4:
                lastSquareDigit = 6;
                break;
            case 5:
                lastSquareDigit = 5;
                break;
            case 6:
                lastSquareDigit = 6;
                break;
            case 7:
                lastSquareDigit = 9;
                break;
            case 8:
                lastSquareDigit = 4;
                break;
            case 9:
                lastSquareDigit = 1;
                break;
            default:
                System.out.println("Что-то не то с программой.");
                return;
        }
    }

    private static void printResult(){
        System.out.println("Последняя цифра квадрата числа " + number + " равняется " + lastSquareDigit);
    }
}