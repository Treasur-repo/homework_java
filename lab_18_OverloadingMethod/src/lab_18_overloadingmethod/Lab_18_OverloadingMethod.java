package lab_18_overloadingmethod;
public class Lab_18_OverloadingMethod {
    public static void main(String[] args) {
        int var1 = 5;
        char letter1 = 'M';
        char letter2 = 'A';
        drawRectangle(var1);
        drawRectangle(var1,letter1);
        drawRectangle(var1,letter2,2);
        double area1 = calArea(5.0,7.0);
        System.out.println("(4)...Triangle 1");
        System.out.println("Triangle (base = 5.0, height = 7.0) has area = " +area1+ "\n");
        double area2 = calArea(3.0,4.0,5.0);
        System.out.println("(5)...Triangle 2");
        System.out.println("Triangle (side1 = 3.0, side2 = 4.0, side3 = 5.0) has area = " +area2+ "\n");
    }
    public static void drawRectangle(int high)
    {
        System.out.println("(1)...Rectangle 1");
        for (int i=0; i<high; i++){
            for (int j=0; j<high; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRectangle(int high, char achar)
    {
        System.out.println("(2)...Rectangle 2");
        for (int i=0; i<high; i++){
            for (int j=0; j<high; j++){
                System.out.print(" " +achar+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void drawRectangle(int high, char achar, int number)
    {
        System.out.println("(3)...Rectangle 3");
        do
        {
            for (int i=0; i<high; i++){
                for (int j=0; j<high; j++){
                    System.out.print(" " +achar+ " ");
                }
                System.out.println();
            }
            System.out.println();
            number--;
        }while(number != 0);
    }
    public static double calArea(double base, double height)
    {
        double area1;
        area1 = 0.5 * base * height;
        return area1;
    }
    public static double calArea(double side1, double side2, double side3)
    {
        double s, area2;
        s = (side1 + side2 + side3)/2;
        area2 = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area2;
    }
}
