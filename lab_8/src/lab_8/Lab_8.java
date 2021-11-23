package lab_8;
import java.util.Scanner;
public class Lab_8 {
    public static void main(String[] args) {
        int id, room, ele, water, wifi, total;
        int i = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("--------"+"Room no : "+(i+1)+"---------");
            System.out.print("Next room no(room no OR 999 for end) : ");
            id = input.nextInt();
            if(id == 999){
                break;
            }
            System.out.print("Rent room : ");
            room = input.nextInt();
            System.out.print("Input Electric(unit) : ");
            ele = input.nextInt();
            ele = ele * 40;
            System.out.println("\t\t= " +ele + " Bath");
            System.out.print("Input Water (unit)   : ");
            water = input.nextInt();
            water = water * 20;
            System.out.println("\t\t= " +water+ " Bath");
            System.out.print("Input Wifi(bath) : ");
            wifi = input.nextInt();
            
            total = room + ele + water + wifi;
            System.out.println("Total rent room : " +total+ " Batn\n\n");
            i++;
        }while(id != 999);
        System.out.println("End program......");
    }  
}
