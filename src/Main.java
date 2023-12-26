import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height in meters. Use a comma (,) for decimals: ");
        double height = scan.nextDouble();

        System.out.print("Please enter your weight in kilograms. Use a comma for decimals: ");
        double weight = scan.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
    }
}