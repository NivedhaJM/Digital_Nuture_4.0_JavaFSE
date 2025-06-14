import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double initialValue = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.1 for 10%): ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter number of years to predict: ");
        int years = sc.nextInt();

        double result = ForecastCalculator.predictFutureValue(initialValue, growthRate, years);
        System.out.printf("Predicted Value after %d years: ₹%.2f\n", years, result);
    }
}
