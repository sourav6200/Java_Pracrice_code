import java.util.*;
public class Sum_Of_First_N_evenNumber {
    public static void main(String[] args){
        Scanner in =new Scanner (System.in);
        int n,sum=0, i=2;
        System.out.println("Enter the number");
        n=in.nextInt();
        while(i<=n){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("The sum of even number upto"+n+"="+sum);
    }
}
