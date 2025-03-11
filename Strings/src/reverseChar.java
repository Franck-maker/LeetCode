import java.util.*;

/**
 * we want to reverse a set of character
 *
 * Approach used: determine the length of the set
 * and divide it by 2 to obtain the number of swaps that you
 * have to do
 */
public class reverseChar {

    public reverseChar(char[] s){
        for (int i= 0; i < s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length -i-1];
            s[s.length-i-1] = temp;

        }

    }
    public static void main(String [] args){

    }
}
