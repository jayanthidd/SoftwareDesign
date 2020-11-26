package com.acme.decorator.secretreader;

import java.io.*;

public class Demo {
    public static void main(String[] args) {
        try {
            SecretReader reader = new SecretReader(new FileReader("secret.txt"), 14);
            int c;
            while ((c=reader.read())>=0){
                System.out.print(Character.toChars(c));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
