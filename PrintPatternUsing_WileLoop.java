public class PrintPatternUsing_WileLoop {
    
        public static void main(String[] args){
            int rows=4,i=rows,j=0;
            while(i>0){
                while(j<=i){
                    System.out.print("*");
                    j++;
                }
                System.out.print(" \n");
                i--;
                j=1;
            }
            
        }
    }

