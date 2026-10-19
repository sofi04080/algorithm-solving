import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        List<Integer> binary = new ArrayList<>();

        while(true){
            if(n%2 == 1) {
                binary.add(1);
                n = n/2;
            } else if(n%2 == 0) {
                binary.add(0);
                n = n/2;
            }
            if(n < 1)
                break;
        }

        for(int i = binary.size(); i > 0; i--){
            System.out.print(binary.get(i-1));
        }
    }
}