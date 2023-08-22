import java.util.Scanner;// to use scanner class this header file is used 

public class ScannerClassSumOfNumbers {
    public static void main (String[] args ){
        int x,y,z;
       Scanner in =new Scanner(System.in);
       System.out.println("Enter two  number");
       x= in.nextInt();
       y = in.nextInt();
       z=x+y;
       System.out.println("Sum ="+z);
    }
}
