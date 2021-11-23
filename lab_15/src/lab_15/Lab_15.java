package lab_15;
import java.util.Scanner;
public class Lab_15 {
    public static void main(String[] args) {
        int number, n;
        boolean found;
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("-----START GAME-----");
        do
        {
            //random number
            found = false;
            n = 0;
            for(int i=0; i<10; i++)
            {
                array[i] = (int)(Math.random()*100);
            }
            do
            {
                System.out.print("Random number >> ");
                number = input.nextInt();
                for(int i=0; i<10; i++)
                {
                    if(number == array[i])
                    {
                        found = true;
                    }
                }
                System.out.println("--> Missing..");
                n++;
            }while(n<5 && found == false);
            if(found == true)
            {
                System.out.println(" >>CONGRATULATION<< ");
                for(int i=0; i<10; i++)
                {
                    System.out.println("Random number "+(i+1)+" = "+array[i]);
                }
            }
            else {System.out.println("  >>GAME OVER<< ");}
            System.out.print("Play again select number 1 ? ");
            number = input.nextInt();
        }while(number == 1);
    }
}
