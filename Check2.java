public class Check2 {
     
public static void main(String[] args)
{
int a[] = new int [2];
a[0] =5;
a[1]  =0;

try{
a[2] = a[0]/a[1];
System.out.println("Divide ="+ a[2] );

}
catch(ArithmeticException e){
    System.out.println(e);

   }
} 

   }

