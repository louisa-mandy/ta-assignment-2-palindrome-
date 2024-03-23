// make a palindrome checker using recursion

import java.util.Scanner;

public class Main {
    public static boolean oui(String s) {
        if (s.length() == 0 || s.length() == 1) // if the length of s is 0 or 1 then its true
            return true;

        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return oui(s.substring(1, s.length() - 1));
            //checking the first and last char of the string
            // removing the first and last char when they are the same for substring
            // repeating until the if conditions halts

        }return false;
        //returning false if its not in the above two if clauses
    }

        public static void main (String[]yes)
        {
            Scanner mandy = new Scanner(System.in);
            System.out.println("Type in a word to check : ");

            String word = mandy.nextLine();
            if (oui(word))
                System.out.println( word + " is a palindrome ");
            else
                System.out.println( word + " is'nt a palindrome ");

        }
    }

