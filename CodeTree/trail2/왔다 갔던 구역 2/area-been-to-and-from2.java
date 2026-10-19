import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] line = new int[10000];
        int pos = 5000;
        int ans = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            switch(dir){
                case('L'):
                    for(int j = 0; j < x; j++){
                        line[pos]++;
                        pos--;
                    }
                break;
                case('R'):
                    for(int j = 0; j < x; j++){
                        pos++;
                        line[pos]++;
                    }
                break;
            }
        }
        for(int i : line){
            if(i >= 2)
                ans++;
        }

        System.out.println(ans);
    }
}