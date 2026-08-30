import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.

        int before = 0;

        for(int i = 0; i < N.length(); i++){
            before = before * A + (N.charAt(i) - '0');
        }

        List<Integer> after = new ArrayList<>();

        while(before > 0) {
            if(before%B != 0){
                int r = before%B;
                after.add(r);
                before /= B;
            } else {
                after.add(0);
                before /= B;
            }
        }

        for(int i = after.size()-1; i >= 0; i--){
            System.out.print(after.get(i));
        }

        if(N.charAt(0) == '0')
            System.out.println(0);
    }
}