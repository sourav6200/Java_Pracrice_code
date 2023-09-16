public class Largest_Element_On_Array {
    public static void main(String[] args) {
        int [] arr={1,23,43,5,22,44};
        int  max =arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max =arr[i];
            }
              System.out.println("Largest element on array is :"+max);
        }
    }

