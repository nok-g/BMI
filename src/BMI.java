import java.util.Scanner;

public class BMI {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height");
        float height =  scanner.nextFloat();
        System.out.println("Please enter your weight");
        float weight =  scanner.nextFloat();

        float bmi = height * weight;
        System.out.println("Your BMI is:" + bmi);

    }
}
