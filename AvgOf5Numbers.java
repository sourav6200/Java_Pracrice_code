import java.util.*;
public class AvgOf5Numbers {
    

public static void main (String[] args){
    float a,b,c,d,e,avg;
    Scanner sc = new Scanner ( System.in);
    //inputting 5 numbers from user
    System.out.println("Enter five numbers ");
    a= sc.nextFloat();
   b = sc.nextFloat();
   c = sc.nextFloat();
   d = sc.nextFloat();
   e = sc.nextFloat();
   avg =(a+b+c+d+e)/5;
   System.out.printf("Averge of numbers =" + avg );
}
}