import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        char[] chars = A.toCharArray();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < A.length(); i++){
            char temp = chars[A.length() - 1];
            for (int k = A.length() - 1; k > 0; k--) {
                chars[k] = chars[k - 1];
            }
            chars[0] = temp;
            int length = 1;
            StringBuilder encoded = new StringBuilder();
            for(int j = 1; j < A.length(); j++) {
                if(chars[j] == chars[j-1]) length++;
                else {
                    encoded.append(chars[j-1] ).append(length);
                    length = 1;
                }
            }
            encoded.append(chars[A.length()-1]).append(length);
            min = Math.min(min, encoded.length());
        }

        System.out.print(min);
    }
}