import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String s = new StringTokenizer(br.readLine()).nextToken();

        List<Character> list = new ArrayList<>(); 
        for(char c : s.toCharArray()) {
            list.add(c);
        }

        int idx = list.size(); // 현재 iterator 위치

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            char putChar = '0';
            if(command.equals("P")) {
                putChar = st.nextToken().charAt(0);
            }

            switch (command) {
                case "L":
                    if(idx - 1 >= 0) idx--;    
                    break;
                case "R":
                    if(idx + 1 <= list.size()) idx++;
                    break;
                case "D":
                    if(idx != list.size()) list.remove(idx);
                    break;
                case "P":
                    list.add(idx, putChar);
                    idx++;
                    break;
            }
        }

        for(char c : list) {
            System.out.print(c);
        }
    }
}
