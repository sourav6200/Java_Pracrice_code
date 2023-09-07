import java.util.*;
class Percentage{    public static void main(String[]args){
        int a,b,c;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter physics marks");
        a=in.nextInt();
        System.out.println("Enter chemistry marks");
        b=in.nextInt();
        System.out.println("Enter math marks");
        c=in.nextInt();
        float avg =(a+b+c)/3.0f;
        System.out.println("Your overall percentage is:"+avg);
        if(avg>=40 &&a>=33 &&b>=33 &&c>=33){
            System.out.println("Congrulations,You have been promoted");
        }
        else{
            System.out.println("Sorry,You have been not promoted! Please try again");
        }
    }
}