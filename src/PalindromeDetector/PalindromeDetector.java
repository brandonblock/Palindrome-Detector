package PalindromeDetector;

import java.util.Scanner;

public class PalindromeDetector {

    public static void main(String[] args) {

        boolean result = isPalindrome(getWord());
        userNotify(result);
    }
    
    public static String getWord() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word:");
        String word = input.nextLine();
        
        return word.toLowerCase();
    }
    
    public static boolean isPalindrome(String word) {
        
        String flipped = new StringBuilder().append(word).reverse().toString();
        boolean test = flipped.equals(word);
        
        return test;
    }
    
    public static void userNotify(boolean test) {
    
        String result = test == true ? "It's a palindrome!":"Sorry, not a palindrome.";
        System.out.printf("%s\n", result);
    }
}

