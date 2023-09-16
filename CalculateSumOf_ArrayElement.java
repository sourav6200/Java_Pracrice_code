public class CalculateSumOf_ArrayElement {
    public static void main(String[] args) {
        float[] marks ={23.6f,78.8f,66.9f,54.6f,34.56f};
        float sum =0;
        for(float element:marks){
            sum+= element;
        }
        System.out.println("The value of sum :"+sum);

    }
}
