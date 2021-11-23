package lab_3;
import java.util.Scanner;
public class Lab_3 {
    public static void main(String[] args) {
        double room, electricity, water, wifi;
        double total1, total2, rent;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Rent Room----------");
        System.out.print("Input Room bill      =? ");
        room = input.nextDouble();
        System.out.print("Input WIFI bill      =? ");
        wifi = input.nextDouble();
        System.out.print("Input Electric(unit) =? ");
        electricity = input.nextDouble();
        total2 = electricity*40;
        System.out.print("Input Water (unit)   =? ");
        water = input.nextDouble();
        total1 = water*20;
        
        rent = room + total1 + total2 + wifi;
        System.out.println("\t-----Total-----");
        System.out.println("Electric bill = " +total2+ " Bath ");
        System.out.println("Water bill    = " +total1+ " Bath ");
        System.out.println("Rent Room     = " +rent+ " bath");
        System.out.println("-----------Thank You----------");
    }
    
}
