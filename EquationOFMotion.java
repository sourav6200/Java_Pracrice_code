 import java.util.*;
public class EquationOFMotion {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  v,u,a,s,k;
        System.out.println("Enter the value of v,u,a,s");
        v=in.nextInt();
        u=in.nextInt();
        a=in.nextInt();
        s=in.nextInt();
        k=((v*v)-(u*u)/(2*a*s));
        System.out.println("Equation_Of_Motion="+k );
    }
}


