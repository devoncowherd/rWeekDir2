package Week5.BasicMultithreading;

import java.security.*;


public class HashExample {
    public static void main(String [] args){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        // try{
        //     MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        //     messageDigest.update(salt);
        //     byte[] hashedPassword = messageDigest.digset(passwordToHash.getBytes(StandardCharsets.UTF-8));

        // } catch(Exception e){
        //     e.printStackTrace();
        // }
    }
}
