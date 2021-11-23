package lab_12;
public class Lab_12 {
    public static void main(String[] args) {
        System.out.println("--Triangle hollow--");
        int n = 5;
        for(int first =0; first<7; first++){ 
            System.out.print("1 ");
        }
        System.out.println();
        for(int row = 1; row<=5; row++){
            System.out.print("1 ");
            for(int col = 1; col<n; col++){
                System.out.print("  ");
            }
            System.out.println("1 ");
            n = n - 1;
        }

        for(int last = 1; last<=1; last++){     
            System.out.print("1 ");
        }
        System.out.println();
        System.out.println("------------------");
    }  
}
    
