package Testing101;

public class RandomE {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        String emailPrefix = "KabulAfg";
        String randomEmail = emailPrefix + number + "@gmail.com";
        System.out.println(randomEmail);
    }
}
