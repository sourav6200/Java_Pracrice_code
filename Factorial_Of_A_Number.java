import java.util.*;
public class Factorial_Of_A_Number {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int a;
        int factorial =1;
        System.out.println("Enter a number");
        a=in.nextInt();
        for(int i =1; i<=a; i++){
            factorial= factorial*i;
            
        }
        System.out.println("Factorial of "+a+" is " +factorial);
    }
}
