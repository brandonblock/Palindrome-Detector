package PalindromeDetector;

import java.util.Scanner;

public class PalindromeDetector {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your word:");
        String word = input.nextLine();
        String wordlowered = word.toLowerCase();
        StringBuilder tobeflipped = new StringBuilder();
        tobeflipped.append(wordlowered);
        String flipped = tobeflipped.reverse().toString();
        boolean test = flipped.equals(wordlowered);
        String result = test == true ? "It's a palindrome":"Sorry, not a palindrome";
        System.out.printf("\n%s", result);
    }
    
}
