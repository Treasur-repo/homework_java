package lab_17;
import java.util.Scanner;
public class Lab_17 {
    public static void main(String[] args) {
        int i, j, k;
        int n = 0, sum = 0, max = 0;
        int[][][] array = new int[5][6][4];
        Scanner input = new Scanner(System.in);
        for (i=0; i<5; i++){
            System.out.println("------product no." +(i+1)+"-------");
            for (j=0; j<6; j++){
                System.out.println("month no. " +(j+1));
                for (k=0; k<4; k++){
                    System.out.print("employee " +(k+1)+ " sale >> " );
                    array[i][j][k] = input.nextInt();
                }
            }
        }
        System.out.println();
        //show table
        System.out.println("\t\t\t\tsale_1\t\tsale_2\t\tsale_3\t\tsale_4");
        System.out.println("\t\t\t\t--------------------------------------------------------");
        for (i=0; i<5; i++){
            System.out.print("product no." +(i+1)+ "\t");
            n = 0;
            for (j=0; j<6; j++){
                if(n == 1){System.out.print("\t\t");} //กำหนด เพื่อเลื่อนเดือนเข้ามา 2 แท็ป
                System.out.print("month no." +(j+1)+ " |\t");
                for (k=0; k<4; k++){
                    System.out.print(array[i][j][k]+ "\t\t" );
                }
                n = 1; //กำหนด เพื่อเลื่อนเดือนเข้ามา 2 แท็ป
                System.out.println();
            }
        }
        System.out.println("\t\t\t\t--------------------------------------------------------");
        //show max
        System.out.println("----------show 1------------");
        for (i=0; i<5; i++){
            for (j=0; j<6; j++){
                for (k=0; k<4; k++){
                    if (array[i][j][k] > max){
                        max = array[i][j][k];
                    }
                }
            }
            System.out.println("sales maximum product " +(i+1)+ " : " +max);
            max = 0;
        }
        //show total
        System.out.println("----------show 2------------");
        for (i=0; i<5; i++){
            for (j=0; j<6; j++){
                for (k=0; k<4; k++){
                    sum = sum + array[i][j][k];
                }
                System.out.println("product " +(i+1)+ " of month " +(j+1)+ " is " +sum);
                sum = 0;
            }
        }
   }
}
  
