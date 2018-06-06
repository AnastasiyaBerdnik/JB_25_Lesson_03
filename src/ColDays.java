package by.epam.tr.start;

import java.util.Scanner;

public class ColDays {

    private static Scanner sc = new Scanner(System.in);
    private static int year = 0, month = 0, col_day = 0;

    public static void main(String[] args) {

        ColDays.readYear();
        ColDays.readMonth();
        ColDays.printResult();
    }

    private static void readYear(){
        System.out.print("Введите год: ");
        if (sc.hasNextInt()) {
            year = sc.nextInt();
        }
    }

    private static void readMonth(){
        System.out.print("Введите номер месяца: ");
        if (sc.hasNextInt()) {
            month = sc.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    col_day = 31;
                    break;
                case 2:
                    calculateFebDays();
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    col_day = 30;
                    break;
            }
        }
    }

    private static void calculateFebDays(){
        if (year % 4 == 0) {
            col_day = 29;
        } else {
            col_day = 28;
        }
    }

    private static void printResult(){
        System.out.println("Количество дней равно - " + col_day);
    }
}