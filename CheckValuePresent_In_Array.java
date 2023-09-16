import java.util.*;
public class CheckValuePresent_In_Array {
    public static void main(String[] args) {
        int [] marks ={34,54,66,77,45,23,99};
        Scanner in =new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num=in.nextInt();
        boolean isInArray=false;
        for(int element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }
    if(isInArray){
        System.out.println("the value is present on an array");
    }
    else{
       System.out.println("the value is not present on an array");
    }
    }
}
