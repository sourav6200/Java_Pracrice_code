import java.util.*;
class Calculate_Percentage{
public static void main(String[] args){
    float a,b,c,d,e,f;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter five subject marks");
    a=in.nextFloat();
   b =in.nextFloat();
   c =in.nextFloat();
   d =in.nextFloat();
   e =in.nextFloat();
   f =(((a+b+c+d+e)/500)*100);
   System.out.print("Your percentage is "+f);
}
}