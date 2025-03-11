import java.util.*;

/**
 * Write a function that reverses a string.
 * The input string is given as an array of character s
 */

public class reverseString {

//    public static String stringreverse ( String s){
//        String[] splitstring = s.split("");
//
//        StringBuilder rev = new StringBuilder();
//        for(int i = splitstring.length -1; i>=0; i--){
//            rev.append(splitstring[i]);
//        }
//        return rev.toString();
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a String: ");
//        String str = sc.nextLine();
//        System.out.println(stringreverse(str));

    /**
     * Other approach
     */
    public static String stringreverse (String s){
        String reversed = "";
        for(int j = s.length()-1; j >=0; j-- ){
            reversed += s.charAt(j);
        }
        return reversed;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println(stringreverse(str));
    }
}





