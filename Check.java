import java.util.*;
public class Check 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System .in);
int x,y,z;
System.out.println("Enter 2 numbers");
x =in.nextInt();
y =in.nextInt();
try{
    z=x/y;
    System.out.println("Divide =" +z);
}
catch(ArithmeticException e){
    System.out.println(e);

}
}
}

