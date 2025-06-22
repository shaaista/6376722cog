import java.util.Scanner;

public class FinancialForecastBasic {

    public static double forecast(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecast(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current value: ");
        double value = sc.nextDouble();

        System.out.print("Enter growth rate (e.g., 0.10 for 10%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double futureValue = forecast(value, rate, years);
        System.out.printf("Forecasted value after %d years: %.2f\n", years, futureValue);

        sc.close();
    }
}
