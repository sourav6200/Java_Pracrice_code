public class Print_First_N_OddNumber_usingFor_Loop {
    public static void main (String[] args){
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        int n =5;
        for( int i= 0;i<n;i++)
        {
            System.out.println(2*i+1);
        }
    }
}
