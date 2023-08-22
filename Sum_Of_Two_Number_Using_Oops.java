import java.lang.*;
import java.util.*;
class sum{
    int a,b,c;
    Scanner in = new Scanner (System.in);
    void input() {
System.out.println("Enter 2 numbers");
a=in.nextInt();
b=in.nextInt();
    }
void process(){
    c=a+b;
}
void output(){
    System.out.println("Sum =" +c);
}
} 

class Sum_Of_Two_Number_Using_Oops {
    public static void main (String[] args){
        sum obj=new sum();
        obj.input ();
        obj.process () ;
        obj.output() ;
        }
    }