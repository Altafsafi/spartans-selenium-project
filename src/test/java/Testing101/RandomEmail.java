package Testing101;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10000);
        String email ="Franzkafka";
        String AutoEmail = email + x + "@gmail.com";
        System.out.println(AutoEmail);

    }
}
