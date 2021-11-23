package lab_9;
import java.util.Scanner;
public class Lab_9 {
    public static void main(String[] args) {
        float id, HW, report, mid, fin, score;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<=9; i++){   // นักศึกษา 10 คน
            System.out.print("ID : ");
            id = input.nextFloat();
            System.out.print("Homework score : ");
            HW = input.nextFloat();
            System.out.print("Report score   : ");
            report = input.nextFloat();
            System.out.print("Midtrem score  : ");
            mid = input.nextFloat();
            System.out.print("Final score    : ");
            fin = input.nextFloat();
            score = HW + report + mid + fin;
            
            //check invalid score
            if(score < 0 || score > 100){
                System.out.println(score + " Invalid score...(Input score again)");
                continue;
            }
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
                System.out.println("Grade F : " +score+ " score");
            }
            System.out.println();
        }
    }
    
}
