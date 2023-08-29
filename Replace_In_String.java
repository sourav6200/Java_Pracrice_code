import java.util.*;
class Replace_In_String{
    public static void main(String[] args){
    String x,y;
    Scanner in =new Scanner(System.in);
    System.out.println("Enter a string with space ");
    x=in.nextLine();
    y=x.replace(" ","_");
    System.out.println(y);
}
    }
