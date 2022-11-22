
import java.util.*;

public class Recursion {
    public static void main(String[] args) {
        
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
