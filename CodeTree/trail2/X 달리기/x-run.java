import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // Please write your code here.

        int ans = 0;
        int pow = 0;

        for(int i = 1; i <= 100; i++) {
            if( x >= i * i) pow = i;
        }

        if(x == pow * pow) ans = 2 * pow - 1;
        else if ( x <= pow * pow + pow) ans = 2 * pow;
        else if ( x > pow * pow + pow) ans = 2 * pow + 1;

        System.out.print(ans);

    }
}