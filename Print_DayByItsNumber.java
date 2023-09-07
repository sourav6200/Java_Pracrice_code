import java .util.*;
public class Print_DayByItsNumber {
    public static void main (String[] args){
        Scanner in =new Scanner (System.in);
        System.out.println("Enter any one number from 1 to 7");
        int day =in.nextInt();
        switch(day){
            case 1-> System.out.println("Mondy");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thrusday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
        }

    }
}
