 import java.util.*;
public class Factorial_Using_WhileLoop {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int a;
        int factorial =1;
        System.out.println("Enter a number");
        a=in.nextInt();
        int i=1;
        while(i<=a){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of "+a+" is " +factorial);
    }
    
}
