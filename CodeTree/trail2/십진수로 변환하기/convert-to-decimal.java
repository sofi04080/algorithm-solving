import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int decimal = 0;

        for(int i = 0; i < binary.length(); i++) {
            decimal =  decimal * 2 + (binary.charAt(i) - '0');
        }

        System.out.println(decimal);
    }
}