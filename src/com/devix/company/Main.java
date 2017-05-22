package com.devix.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String text = "Hola Mundo";
        Random random = new Random();

        int select = random.nextInt(text.length());
        System.out.println("Random with Char " + text.charAt(select));
    }
}
