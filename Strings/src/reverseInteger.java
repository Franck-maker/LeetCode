import java.util.*;

/**
 * we are trying here to find the reverse of a number
 * whether it's positive or negative

 * Given a signed 32-bit integer n, return x with its digits reversed. if reversing
 * x causes the value to go outside the signed 32-bit range [-2^31, 2^31-1] then return 0
 */

public class reverseInteger {

    public static int reverseNumber(int n){
        boolean isNegative = n < 0;
        if(isNegative) {
            n = -n;
        }
        int reverse = 0;
        int remain;
        while (n > 0) {
            remain = n % 10;
            reverse = reverse * 10 + remain;

            // To ensure the value doesn't go outside the signed 32-bit range
            // to respect the storage limit of an integer in Java

            if((reverse - remain)/10 != 0){
                return 0;
            }
            n /= 10;

        }
        return isNegative ? reverse*-1: reverse;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a relative number: ");
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));
    }
}
