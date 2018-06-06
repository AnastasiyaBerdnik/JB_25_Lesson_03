package by.epam.tr.start;

import java.util.Scanner;

public class MinMaxString {

    private static String max = "";
    private static String min = "";

    public static void main(String[] args) {

        MinMaxString.searchMinMax();
        MinMaxString.printResult();
    }

    private static void searchMinMax() {
        int n = 10;

        Scanner sc = new Scanner(System.in);
        String str = "";
        int i = 0;
        for (i = 0; i < n; i++) {
            System.out.print("> ");
            if (sc.hasNextLine()) {
                str = sc.nextLine();
                checkFirstLine(str, i);
                checkMaxLine(str);
                checkMinLine(str);
            }
        }
    }

    private static void checkFirstLine(String str, int i){
        if (i == 0) {
            min = str;
        }
    }

    private static void checkMaxLine(String str){
        if (str.length() > max.length()) {
            max = str;
        }
    }

    private static void checkMinLine(String str){
        if (str.length() < min.length()) {
            min = str;
        }
    }

    private static void printResult() {
        System.out.println("max string = " + max + " length=" + max.length());
        System.out.println("min string = " + min + " length=" + min.length());
    }
}

