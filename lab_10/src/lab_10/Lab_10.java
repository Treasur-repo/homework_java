package lab_10;
import java.util.Scanner;
public class Lab_10 {
    public static void main(String[] args) {
        int key = 1;
        int hw, report, mid, fin;
        Scanner input = new Scanner(System.in);
        do{
            //input
            System.out.print("Homework score(0-20): ");
            hw = input.nextInt();
            
            if(hw <0 || hw > 20){
               System.out.println("INVALID SCORE!!");
               continue;
            }
            System.out.print("Report score(0-10)  : ");
            report = input.nextInt();
            if(report <0 || report > 10){
                System.out.println("INVALID SCORE!!");
                continue;
            }
            System.out.print("Midtrem score(0-30) : ");
            mid = input.nextInt();
            if(mid <0 || mid > 30){
                System.out.println("INVALID SCORE!!");
                continue;
            }
            System.out.print("Final score(0-40)   : ");
            fin = input.nextInt();
            if(fin <0 || fin > 40){
                System.out.println("INVALID SCORE!!");
                continue;
            }
            //process
            int score = hw + report + mid + fin;
            if(score >= 90){
                System.out.println("Grade A : " +score+ " Score");
            }
            else if(score >=80){
                System.out.println("Grade B : " +score+ " Score");
            }
            else if(score >=70){
                System.out.println("Grade C : " +score+ " Score");
            }
            else if(score >=50){
                System.out.println("Grade D : " +score+ " Score");
            }
            else{
                System.out.println("Grade F : " +score+ " (You Fail)");
            }
            System.out.println();
            //key number
            System.out.print("More strdent? (key 1 for yes / other for end : ");
            key = input.nextInt();
        }while(key == 1);
        System.out.println("End Program....Thank you....");
    }
}
