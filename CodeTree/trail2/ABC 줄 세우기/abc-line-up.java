import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        // Please write your code here.

        boolean isSorted = false;
        
        int count = 0;
        for (int j = 0; j < arr.length - 1; j++) { 
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                }
            }
        }

        System.out.print(count);
        
    }
}