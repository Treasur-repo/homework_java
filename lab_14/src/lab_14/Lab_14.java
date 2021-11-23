package lab_14;
import java.util.Scanner;
public class Lab_14 {
    public static void main(String[] args) {
        int cnt = 1;
        int number;
        int n = 1;
        Scanner input = new Scanner(System.in);
        while(n != 0){
            System.out.print("Enter number(greater than 10 and not greater than 30) : ");
            number = input.nextInt();
            if(number<10 || number >30){
                continue;
            }
            while(cnt <= 12){
                int m = number * cnt;
                System.out.println(number+ " x " + cnt + " = " +m);
                cnt++;
            }
            //กำหนดเพื่อให้ loop while จบการทำงาน
            n = 0;
        }
    } 
}  