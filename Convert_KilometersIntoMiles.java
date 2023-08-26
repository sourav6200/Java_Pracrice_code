import java.util.*;
public class Convert_KilometersIntoMiles {
    public static void main(String[] args) {
    float a,b;
    Scanner in = new Scanner (System.in);
    System.out.println("Enter the value of kilometers: ");
    a = in.nextFloat();
    b =(a*0.621371f);
    System.out.print("kilometer="+a);System.out.println("  In miles =" +b);
}
}