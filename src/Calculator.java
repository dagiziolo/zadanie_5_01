import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double number1 = scan.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double number2 = scan.nextDouble();
        CalculatorFunction calcul = new CalculatorFunction();


    }
}
