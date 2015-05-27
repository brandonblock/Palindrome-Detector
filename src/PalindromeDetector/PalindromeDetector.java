package PalindromeDetector;

import java.util.Scanner;

public class PalindromeDetector {

    public static void main(String[] args) {
        // TODO code application logic here
        String userword = getWord();
        boolean result = isPalindrome(userword);
        userNotify(result);
    }
    
    public static String getWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String word = input.nextLine();
        return word;
    }
    
    public static boolean isPalindrome(String word) {
        
        String wordlowered = word.toLowerCase();
        StringBuilder tobeflipped = new StringBuilder();
        tobeflipped.append(wordlowered);
        String flipped = tobeflipped.reverse().toString();
        boolean test = flipped.equals(wordlowered);
        
        return test;
    }
    
    public static void userNotify(boolean test) {
    
        String result = test == true ? "It's a palindrome!":"Sorry, not a palindrome.";
        System.out.printf("%s\n", result);
    }
}

