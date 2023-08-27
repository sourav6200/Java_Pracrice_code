import java.util.*;

public class QuartraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b,a,c,k;
        System.out.println("Enter the value of b,a,c" );
        b=in.nextInt();
       a=in.nextInt();
        c=in.nextInt();
        k=(((b*b)-4*a*c)/2*a);
        System.out.println("QuardtraticEquation(b*b)-4*a*c)/2*a)=" +k);
    }
}
