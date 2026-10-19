import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        int count = 0;

        for (int i = x; i <= y; i++) {
            if (isPalindrome(i)) count++;
        }

        System.out.print(count);
    }

    public static boolean isPalindrome(int i) {
        String s = String.valueOf(i);
        int left = 0;
        int right = s.length() - 1;
            
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
