package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Alice myFirstAlice = new Alice ();
        String searchTerm = myFirstAlice.searchPrompt();
        Boolean returnedResult = myFirstAlice.searchAlice(searchTerm);

        if (returnedResult == true) {
            myFirstAlice.wordIndex(searchTerm);
        }

        System.out.println("Search result: " + returnedResult);
    }

    public void removeSearchTerm (String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLower = theQuote.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();


        int startingPoint1 = 0;
        int endingPoint1 = theQuoteLower.indexOf(searchTermLower);
        int startingPoint2 = theQuoteLower.indexOf(searchTermLower) + searchTermLower.length();

        String newQuote = theQuote.substring(startingPoint1, endingPoint1) + theQuote.substring(startingPoint2);
        System.out.println(newQuote);
    }

    public void wordIndex(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLower = theQuote.toLowerCase();
        String searchTermLower = searchTerm.toLowerCase();

        int theIndex = theQuoteLower.indexOf(searchTermLower);
        System.out.println("Search term at: "+ theIndex + "and length is: " + searchTerm.length());
    }

    public String searchPrompt() {
        Scanner input = new Scanner(System.in);
        String searchTerm = input.nextLine();
        input.close();
        return searchTerm;
    }

    public boolean searchAlice(String searchTerm){
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String theQuoteLowercase = theQuote.toLowerCase();
        String searchTermLowercase = searchTerm.toLowerCase();
        Boolean result = theQuoteLowercase.contains(searchTermLowercase);
        return result;
    }
}
