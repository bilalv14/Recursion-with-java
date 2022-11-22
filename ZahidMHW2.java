package ZahidMHW2;
import java.util.*;
/**
 *
 * My words and actions will reflect Academic Integrity I will not cheat or lie
 * or steal in academic matters I will promote integrity in the UNCG community
 * Muhammad Zahid 02/8/22
 */

/**
 * ZahidMHW2
 * Muhammad Zahid
 * CSC 230, Sec 03
 */

public class ZahidMHW2 {
    public static void main(String[] args) {
        System.out.println("ZahidMHW2" + "\nMuhammad Zahid" + "\nCSC 230, Sec 03");
        System.out.println();
        System.out.println("This program creates a recursive method called countUppercase() to return"
                + "\n the number of uppercase letters in a string"
                + "\nA second method uses a recursive method and a helper method."
                + "\nThe method is called count() and it returns the number of uppercase letters in an array of"
                + "\n characters.");
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.println("This is the run from calling countUppercase()");
        System.out.print("Enter a string: ");
        String x = input.nextLine();
        System.out.println("The upper letters in " + x + " is " + countUppercase(x));
        System.out.println();
        System.out.println("This is the run from calling count()");
        System.out.print("Enter a string: ");
        String y = input.nextLine();
        System.out.println("The number of uppercase letter is " + count( y.toCharArray()));


    }
    public static int countUppercase(String s) {

        if (s.length() == 0) {
            return 0;
        }
        else {
            return countUppercase(s.substring(1)) + (Character.isUpperCase(s.charAt(0)) ? 1 : 0);
        }


    }

    public static int count(char [] chars){
           return count(chars, chars.length-1);
    }

    public static int count(char [] chars, int high){
        if (high < 0){
            return 0;
        }
        else if (high == 0){
            if (Character.isUpperCase(chars[high])){
                return 1;
            }
            else{
                return 0;
            }
        }
        else{
            if (Character.isUpperCase(chars[high])){
                return count(chars, high-1) +1;
            }
            else {
                return count(chars,high-1);
            }
        }
    }
}
