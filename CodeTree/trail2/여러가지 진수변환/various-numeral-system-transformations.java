import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        List<Integer> bList = new ArrayList<>();

        while(true){
            if(n%b != 0){
                bList.add(n%b);
                n = n/b;
            } else {
                bList.add(0);
                n = n/b;
            }
            if(n<1)
                break;
        }

        for(int i = bList.size() - 1; i >= 0; i--){
            System.out.print(bList.get(i));
        }
    }
}