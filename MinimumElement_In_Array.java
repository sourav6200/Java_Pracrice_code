public class MinimumElement_In_Array {
    
        public static void main(String[] args) {
            int [] arr={1,23,43,5,22,44};
            int  min =arr[0];
            for(int i=0;i<arr.length;i++){
                if (arr[i]<min)
                    min =arr[i];
                }
                  System.out.println("Smallest element on array is :"+min);
            }
        }
    

