public class Average_Of_An_Array {
    public static void main(String[] args){
        float [] marks ={45.7f,43.5f,98.7f,87.6f,33.5f};
        float sum=0;
        for(float element:marks){
            sum +=element;
        }
        System.out.println("the value of average markes is :"+sum/marks.length);
    }
}
