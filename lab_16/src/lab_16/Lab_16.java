package lab_16;
import java.util.Scanner;
public class Lab_16 {
    public static void main(String[] args) {
        int sum = 0;
        int row, col;
        int HW=0, RE=0, QU=0, FI=0;
        double tot_hw = 0, tot_re = 0, tot_qu = 0, tot_fi = 0, total = 0;
        int A = 0, B = 0, C = 0, D = 0, F = 0;
        Scanner input = new Scanner(System.in);
        int [][] student = new int[12][4];
        //input score
        for(row=0; row<12; row++){
            System.out.println("Enter student no. "+(row+1)+ " >>");
            for(col=0; col<4; col++){
                //input homework score
                System.out.print("Homework score (0-20) : ");
                student[row][col] = input.nextInt();
                while(student[row][col] < 0 || student[row][col] > 20)
                {
                    System.out.println("INVALID SCORE..");
                    System.out.print("Homework score (0-20) : ");
                    student[row][col] = input.nextInt();
                }
                HW += student[row][col];
                tot_hw = HW/12;
                col++;
                //input report score
                System.out.print("Report score (0-10)   : ");
                student[row][col] = input.nextInt();
                while(student[row][col]<0 || student[row][col] >10)
                {
                    System.out.println("INVALID SCORE..");
                    System.out.print("Report score (0-10)   : ");
                    student[row][col] = input.nextInt();
                }
                RE += student[row][col];
                tot_re = RE/12;
                col++;
                //input quiz score
                System.out.print("Quiz score (0-30)     : ");
                student[row][col] = input.nextInt();
                while(student[row][col]<0 || student[row][col]>30)
                {
                    System.out.println("INVALID SCORE..");
                    System.out.print("Quiz score (0-30)     : ");
                    student[row][col] = input.nextInt();
                }
                QU += student[row][col];
                tot_qu = QU/12;
                col++;
                //input final score
                System.out.print("Final score (0-40)    : ");
                student[row][col] = input.nextInt();
                while(student[row][col]<0 || student[row][col] >40)
                {
                    System.out.println("INVALID SCORE..");
                    System.out.print("Final score (0-40)    : ");
                    student[row][col] = input.nextInt();
                }
                FI += student[row][col];
                tot_fi = FI/12;
                col++;
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\tHW\tRE\tQU\tFI\tTOT\tGRADE");
        System.out.println("--------------------------------------------------------------");
        for(row = 0; row < 12; row++){
            sum = 0;
            System.out.print("Student no. "+(row+1)+"|\t");
            for(col =0; col<4; col++){
                System.out.print(student[row][col]+ "\t");
                sum = sum + student[row][col];
            }//end col
            System.out.print(sum); //show sum
            total += sum;
            System.out.print("\t");
            if(sum >= 90){
                System.out.println("A");
                A++;
            }
            else if(sum >=80){
                System.out.println("B");
                B++;
            }
            else if(sum >=70){
                System.out.println("C");
                C++;
            }
            else if(sum >=50){
                System.out.println("D");
                D++;
            }
            else{
                System.out.println("F");
                F++;
            }
        }//end row
        System.out.println("--------------------------------------------------------------");
        System.out.println("Average\t\t" +tot_hw+ "\t" +tot_re+ "\t" +tot_qu+ "\t" +tot_fi+ "\t" +total/12);
        System.out.println("----------Total-----------");
        System.out.println("Number of A student = " +A+ " คน ");
        System.out.println("Number of B student = " +B+ " คน ");
        System.out.println("Number of C student = " +C+ " คน ");
        System.out.println("Number of D student = " +D+ " คน ");
        System.out.println("Number of F student = " +F+ " คน ");
    }   
}

