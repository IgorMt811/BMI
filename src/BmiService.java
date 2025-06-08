public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double result = weightKg / heightM;
        int roundedResult = (int) result;
        return roundedResult;
    }
}