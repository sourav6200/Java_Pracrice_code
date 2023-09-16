public class Sorted_Array {
    public static void main(String[] args) {
        boolean isSorted=true;
        int [] arr= {1,3,5,7,9,45,56,67,78};
        for(int i=0;i<arr.length -1;i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("the array is sorted");
        }
        else{
             System.out.println("the array is  not sorted");
        }
    }
}
