import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        int minSquare = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            // N 인덱스의 점 하나하나씩 제외해가며 직사각형 넓이 구하기
            int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
            int tempSquare = 0;
            for(int j = 0; j < N; j++) {
                if(i == j) continue;
                if(x[j] < minX) minX = x[j];
                if(x[j] > maxX) maxX = x[j];
                if(y[j] < minY) minY = y[j];
                if(y[j] > maxY) maxY = y[j];
            }

            tempSquare = Math.abs(maxX - minX) * Math.abs(maxY-minY);

            if(minSquare > tempSquare) minSquare = tempSquare;
        }

        System.out.println(minSquare);
    }
}