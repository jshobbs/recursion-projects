package com.jeffhobbsonline;

import java.util.Scanner;

/**
 * Palindrome class to check strings entered from the console.
 *
 */
public class Palindrome 
{
    public static boolean isPalindrome(String s)
    {   
        if(s.length() == 0 || s.length() == 1)
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))

        return isPal(s.substring(1, s.length()-1));

        return false;
    }

    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to check:");
        String string = scanner.nextLine();

        if(isPalindrome(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}