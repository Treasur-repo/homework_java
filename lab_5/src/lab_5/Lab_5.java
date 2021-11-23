package lab_5;
import java.util.Scanner;
public class Lab_5 {
    public static void main(String[] args) {
        int HW, Report, Mid, Final;
        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("Homework score : ");
        HW = input.nextInt();
        System.out.print("Report score   : ");
        Report = input.nextInt();
        System.out.print("Midtrem score  : ");
        Mid = input.nextInt();
        System.out.print("Final score    : ");
        Final = input.nextInt();
        
        score = HW + Report + Mid + Final;
        if(score <= 100){
           if(score >= 90){
                System.out.println("You got Grade A : " +score+ " Score");
            }
            else if(score >=80){
                System.out.println("You got Grade B : " +score+ " Score");
            }
            else if(score >=70){
                System.out.println("You got Grade C : " +score+ " Score");
            }
            else if(score >=50){
                System.out.println("You got Grade D : " +score+ " Score");
            }
            else{
                System.out.println("You got Grade F : " +score+ " (You Fail)");
            }
        }
        else{
            System.out.println("!!!INVALID SCORE");
        }
    }   
}
