import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wzrosc (w m) ");
     double wzrost = scanner.nextDouble();
        System.out.println("podaj wage (w kg) ");
        double waga = scanner.nextDouble();
        double BMI =waga/ (wzrost*wzrost) ;

        if (BMI < 18.5) {
            System.out.println("nie dowaga");
        }

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("waga normalna");
        }

        else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("nad waga");
        }
        else if (BMI >30) {
            System.out.println("otylosc");
        }
        else {

        }
        scanner.close();

    }
}
