import java.util.Scanner;

public class FunctionCalculator {

    private static int a = 0;
    private static int b = 0;
    private static int h = 0;

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        FunctionCalculator.enterParameters();
        FunctionCalculator.calculateFunction();
    }

    private static void enterParameters(){
        readA();
        readB();
        readH();
    }

    private static void readA(){
        System.out.print("Введите число а: ");
        while (!sc.hasNextInt()){
            sc.nextInt();
        }
        a = sc.nextInt();
    }

    private static void readB(){
        System.out.print("Введите число b: ");
        while (!sc.hasNextInt()){
            sc.nextInt();
        }
        b = sc.nextInt();
    }

    private static void readH(){
        System.out.print("Введите шаг h: ");
        while (!sc.hasNextInt()){
            sc.nextInt();
        }
        h = sc.nextInt();
    }

    private static double calculateResult(int x){
        double result;
        if (x/2 == 90 || x/2 == -90){
            result = Double.NaN;
        } else {
            double rad = Math.toRadians(x);
            result = 2 * Math.tan(rad / 2) + 1;
        }
        return result;
    }

    private static void calculateFunction(){
        int x = 0;
        System.out.println("| x | result |");
        for (x = a; x <= b; x += h){
            double result = calculateResult(x);
            printResult(x, result);
        }
    }

    private static void printResult(int x, double result){
        System.out.println("| " + x + " | " + result + " |");
    }

}
