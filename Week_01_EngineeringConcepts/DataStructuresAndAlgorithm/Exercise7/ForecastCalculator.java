public class ForecastCalculator {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return predictFutureValue(currentValue * (1 + rate), rate, years - 1);
    }

    // Optimized iterative method for long-term predictions (optional)
    public static double predictIteratively(double currentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + rate);
        }
        return currentValue;
    }
}
