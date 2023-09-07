import java.util.*;
public class Type_Of_Website {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String website=in.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organixation website");
     }
     else if (website.endsWith(".in")){
System.out.println("This is an indian website");}
else if (website.endsWith(".com")){
System.out.println("this is a commercial site");
}
     }
    }

