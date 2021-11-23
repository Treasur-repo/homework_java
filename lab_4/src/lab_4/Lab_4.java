package lab_4;
import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args) {
        int score;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score : ");
        score = input.nextInt();
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
}
