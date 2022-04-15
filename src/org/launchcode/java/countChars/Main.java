package org.launchcode.java.countChars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or words:");
        String str = input.nextLine();
        input.close();
        CountChars myCharacterCounter= new CountChars();
        myCharacterCounter.characterCounter(str);


    }
}
