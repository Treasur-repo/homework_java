package lab_2;
import java.util.Scanner;
public class Lab_2{
    public static void main(String[] args) {
        double width, lenght, high, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Width  =? ");
        width = input.nextDouble();
        System.out.print("Input Lenght =? ");
        lenght = input.nextDouble();
        System.out.print("Input High   =? ");
        high = input.nextDouble();
        total = 2*(width*lenght) + 2*(high*lenght);
        
        System.out.println("Skin Area  =? " + total);
    }  
}
