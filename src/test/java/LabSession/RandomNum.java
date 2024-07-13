package LabSession;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Random random = new Random();

        int RandomNumber = random.nextInt(1000);
        String Email = "Testcode";
        String RandomEmail = Email + RandomNumber + "@gmail.com";
        System.out.println(RandomEmail);
        


    }
}
