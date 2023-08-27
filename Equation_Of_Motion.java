import java.util.*;
public class Equation_Of_Motion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  v,u,k;
        System.out.println("Enter the value of v,u");
        v=in.nextInt();
        u=in.nextInt();
        k=((v*v)-(u*u));
        System.out.println("Equation_Of_Motion="+k );
    }
}
