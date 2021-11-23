package lab_1_fahrenheit;
import java.util.Scanner;
public class Lab_1_Fahrenheit {
    public static void main(String[] args) {
        double C,F;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Celcius =? ");
        C = input.nextDouble();
        F = (C*9.0/5.0)+32.0;
        System.out.println("Fahrenheit = "+F);
    }
}
