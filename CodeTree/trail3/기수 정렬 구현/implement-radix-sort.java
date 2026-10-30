import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            int temp = arr[i];
            max = Math.max(max, arr[i]);
        }

        int k = 0;
        int temp = max;
        if (temp == 0) k = 1;
        while (temp > 0) {
            k++;
            temp /= 10;
        }

        // Please write your code here.
        int digitNow = 1;

        for(int i = 1; i <= k; i++) {
            
            // 정렬 배열 초기화
            List<Integer>[] posArr = new ArrayList[10];
            for (int j = 0; j < posArr.length; j++) {
                posArr[j] = new ArrayList<>();
            }

            for(int j = 0; j < arr.length; j++) {
                int digit = (arr[j] / digitNow) % 10;
                posArr[digit].add(arr[j]);
            }

            List<Integer> aligned = new ArrayList<>();
            for(int j = 0; j < 10; j++) {
                for(int l = 0; l < posArr[j].size(); l++) {
                    aligned.add(posArr[j].get(l));
                }
            }

            for(int j = 0; j < aligned.size(); j++) {
                arr[j] = aligned.get(j);
            }

            digitNow *= 10;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}