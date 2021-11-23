package lab_7;
import java.util.Scanner;
public class Lab_7 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double width, lenght, rectangle;
        double base, high, tringle;
        double radius, circle;
        System.out.println("------------Select----------");
        System.out.println("calculate rectangle area...1");
        System.out.println("calculate triangle area....2");
        System.out.println("calculate circle area......3");
        System.out.println("----------------------------\n");
        
        System.out.print("Please Select 1/2/3 ? ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        switch(num){
            case 1: System.out.print("Enter width  =? ");
                    width = input.nextDouble();
                    System.out.print("Enter lenght =? ");
                    lenght = input.nextDouble();
                    rectangle = width * lenght;
                    System.out.println("Rectangle area = " +rectangle);
                    break;
            case 2: System.out.print("Enter base =? ");
                    base = input.nextDouble();
                    System.out.print("Enter high =? ");
                    high = input.nextDouble();
                    tringle = 0.5 * base * high;
                    System.out.println("Tringle area = " +tringle);
                    break;
            case 3: System.out.print("Enter radius =? ");
                    radius = input.nextDouble();
                    circle = PI*radius*radius;
                    System.out.print("Circle area = " +circle);
                    break;
            default: System.out.println("INVALID CHOICE!!!!");
        }
    } 
}
