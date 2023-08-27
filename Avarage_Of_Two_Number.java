import java.util.*;
public class Avarage_Of_Two_Number {
    public static void main(String[] args) {
        int x,y,z;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter two number:");
        x=in.nextInt();
        y=in.nextInt();
        z=(x+y)/2;
        System.out.println("(x+y)/2="+z );
    }
}
