import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        char[] line = A.toCharArray();

        int ans = 0;

        for(int i = 0; i < line.length; i++) {
            if(line[i] == '(') {
                for(int j = i; j < line.length; j++) {
                    if(line[j] == ')')
                        ans++;
                }
            }
        }

        System.out.println(ans);
    }
}