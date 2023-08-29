public class To_Change_Letter {
    public static void main(String[] args) {
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>", "Sourav");
        System.out.println(letter);
    }

}
