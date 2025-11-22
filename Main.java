import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- BMI Calculator ---");
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = BMICalculator.calculate(weight, height);
        System.out.println("Your BMI: " + String.format("%.2f", bmi));
        System.out.println("Category: " + BMICalculator.category(bmi));
        sc.close();
    }
}
