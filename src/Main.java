public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weightKg = 86;
        double heightM =Math.pow(1.87,2) ;
        int bmi = (int) service.calculate(weightKg,heightM);
        System.out.println("BMI: " + bmi);
    }
}