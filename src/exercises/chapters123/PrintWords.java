package exercises.chapters123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintWords {
    public static void main(String[] args) {
//        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("random", "word", "list", "coconut", "potatoes", "phone", "bikes", "water", "source", "email"));
        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] seussArr = seuss.split(" ");
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList(seussArr));

        System.out.println(PrintWords.printLengths(wordList));
    }

    public static ArrayList<String> printLengths(ArrayList<String> wordsToPrint) {
        ArrayList<String> newList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        Integer num = input.nextInt();
        input.close();

        for (String i : wordsToPrint) {
            if (i.length() == num) {
                newList.add(i);
            }
        }
        return newList;
    }
}
