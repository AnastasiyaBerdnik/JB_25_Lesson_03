import java.util.Scanner;

public class ConditionFunctionCalculate {

    private static double x = 0;
    private static double result = 0;

    public static void main(String[] args) {

        ConditionFunctionCalculate.readX();
        ConditionFunctionCalculate.calculateResult();
        ConditionFunctionCalculate.printResult();
    }

    private static void readX(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        while (!sc.hasNextInt()){
            sc.nextInt();
        }
        x = sc.nextInt();
    }

    private static void calculateResult(){
        if (x <= -3){
            result = 9;
        } else if (x > 3) {
            calculateFunc();
        } else {
            result = Double.NaN;
        }
    }

    private static void calculateFunc(){
        double denominator = Math.pow(x, 2) + 1;
        if (denominator == 0){
            result = Double.NaN;
        } else {
            result = 1/denominator;
        }
    }

    private static void printResult(){
        System.out.println("Result: " + result);
    }
}
