package LabSession;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        String Email = "Testclass";
        int AutoNumber= random.nextInt(10000);
        String RandomEmail = Email + AutoNumber + "@gmail.com";
        System.out.println(RandomEmail);


    }
}
