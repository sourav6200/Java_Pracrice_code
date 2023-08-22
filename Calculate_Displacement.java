import java.util.*;
public class Calculate_Displacement {
    public static void main (String[] args){
        double s,u,t,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial velocity,Times, Acceleration");
              u = sc.nextDouble();
              t = sc.nextDouble();
              a = sc.nextDouble();
     s =( u*t +0.5*a*t*t);
 System.out.println("Displacement =" +s);



    }
}
