import java.util.*;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter a year");
        int year=in.nextInt();
        if((year%4==0)||((year%400==0)&&(year%100!=0))){
        System.out.println(year+": leap year");

        }
    else{
        System.out.println(year +":Not leap year");
    }
    }
}
