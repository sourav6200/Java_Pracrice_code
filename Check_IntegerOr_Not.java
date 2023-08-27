import java.util.*;
public class Check_IntegerOr_Not {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        
        if(in.hasNextInt()){
        System.out.println("The input is an integer number");
        }else{
            System.out.println("The input is not an integer number");
        }
        
    }
}
