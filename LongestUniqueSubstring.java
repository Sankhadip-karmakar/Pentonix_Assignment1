import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {

    public static int lengthOfLongestUniqueSubstring(String s) {
        int maxLength = 0;
        int left = 0; 
        int right = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                maxLength = Math.max(maxLength, right - left + 1);
                right++; 
            } else {
                uniqueChars.remove(s.charAt(left));
                left++; 
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = in.next();
        int length = lengthOfLongestUniqueSubstring(input);
        System.out.println("Length of the longest unique substring: " + length);
    }
}