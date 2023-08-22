
import java.util.Scanner;

public class CalculateSimpleIntrest {
    public static void main(String[] args){
        float p,t,r,si;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the principal,time ,rate ");
        p=in.nextFloat();
        t=in.nextFloat();
        r=in.nextFloat();
        si=(p*r*t/100);
        System.out.println(" intrest ="+si);

  

    }
}
