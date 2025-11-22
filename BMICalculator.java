public class BMICalculator {
    public static double calculate(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }

    public static String category(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal weight";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
}