package lab_6;
import java.util.Scanner;
public class Lab_6 {
    public static void main(String[] args) {
        //input
        double eUnit, wUnit, eTemp, wTemp;
        double ePay = 0;
        double wPay = 0;
        double room, wifi, rent;
        Scanner input = new Scanner(System.in);
        System.out.println("------------Rent Room------------");
        System.out.print("Input Room bill      =? ");
        room = input.nextDouble();
        System.out.print("Input WIFI bill      =? ");
        wifi = input.nextDouble();
        //ค่าไฟฟ้า
        System.out.print("Input Electric(unit) =? ");
        eUnit = input.nextDouble();
        if(eUnit>300){
		eTemp = eUnit-300;
		ePay = ePay + eTemp*50;
		eUnit = 300;
	}
	if(eUnit>100){
		eTemp = eUnit-100;
		ePay = ePay + eTemp*45;
		eUnit = 100;
	}
	if(eUnit>0){
		eTemp = eUnit;
		ePay = ePay + eTemp*40;
	}
        System.out.println("----------------PAY-----------------");
        System.out.println("Pay Electric bill = " +ePay+ " Bath ");
        System.out.println("------------------------------------");
        
        //ค่าน้ำ
        System.out.print("Input Water (unit)   =? ");
        wUnit = input.nextDouble();
        if(wUnit>6){
		wTemp = wUnit-6;
		wPay = wPay + wTemp*40;
		wUnit = 6;
	}
	if(eUnit>2){
		wTemp = wUnit-2;
		wPay = wPay + wTemp*30;
		wUnit = 2;
	}
	if(eUnit>0){
		wTemp = wUnit;
		wPay = wPay + wTemp*20;
	}
        System.out.println("----------------PAY-----------------");
        System.out.println("Pay Water bill = " +wPay+ " Bath ");
        System.out.println("------------------------------------\n");
        
        //process
        rent = room + wifi + ePay + wPay;
        //output
        System.out.println("Rent Room     = " +rent+ " bath");
        System.out.println("-------------Thank You--------------");
    }
    
}
