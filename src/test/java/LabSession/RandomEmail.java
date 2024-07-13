package LabSession;

import java.util.Random;

public class RandomEmail {
    public static void main(String[] args) {
        // Random email generator
        String EmailPrefix ="franzkafka";
        int number = (int) (Math.random() * 100);
        String randomEmail = EmailPrefix + number +"@gmail.com";

        System.out.println(randomEmail);


    }
}
