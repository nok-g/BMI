import java.util.Scanner;

public class BMI {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height in meter:");
        float height =  scanner.nextFloat();
        System.out.println("Please enter your weight: ");
        float weight =  scanner.nextFloat();

        float bmi = weight  / height / height  ;
        System.out.println("Your BMI is:" + bmi);

        if  ( bmi < 16 ) {
            System.out.println("Severe thinness");
        }
        else if ( bmi < 17 ) {
            System.out.println ( " Mederate thinness " ) ;
        }
        else if ( bmi < 18.5 ){
            System.out.println(" Mild thinness ") ;
        }
        else {
            System.out.println(" later ");
        }

    }
}
