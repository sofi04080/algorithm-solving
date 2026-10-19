import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int decimal = 0;

        for(int i = 0; i < binary.length() ; i++ ){
            decimal = decimal*2 + (binary.charAt(i) - '0');
        }

        decimal *= 17;

        List<Integer> newBinary = new ArrayList<>();

        while(decimal > 0){
            if(decimal%2 == 1){
                newBinary.add(1);
                decimal = decimal/2;
            } else {
                newBinary.add(0);
                decimal = decimal/2;
            }
        }

        for(int i = newBinary.size(); i > 0; i--){
            System.out.print(newBinary.get(i-1));
        }
    }
}