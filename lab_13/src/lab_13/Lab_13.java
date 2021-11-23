package lab_13;
import java.util.Scanner;
public class Lab_13 {
    public static void main(String[] args) {
      int number, sum = 1;
      int n = 0, i;
      Scanner input = new Scanner(System.in);
      System.out.println("----Calculation Factorail----");
      do{
         System.out.print("Please input number(1-10) : ");
         number = input.nextInt();
         if(number <0 || number >10){
             System.out.println("Wrong number");
             continue;
         }
         for (i=number; i >= 1; i--) { // n! = n*(n - 1)*(n - 2)*...* 1
            sum = sum * i;
            n++;
         }
         System.out.println("-----------Output-----------");
         System.out.println(number+ " factorail = " + sum);
         System.out.println("----------------------------");
      }while(n == 0); 
   }
}
