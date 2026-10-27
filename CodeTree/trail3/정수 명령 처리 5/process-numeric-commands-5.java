import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        // Please write your code here.
        List<Integer> dynamicArray = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int pos;
            switch (order) {
                case "push_back":
                    pos = Integer.parseInt(st.nextToken());
                    dynamicArray.add(pos);
                    break;
                case "pop_back":
                    dynamicArray.remove(dynamicArray.size() - 1);
                    break;
                case "size":
                    System.out.println(dynamicArray.size());
                    break;
                case "get":
                    pos = Integer.parseInt(st.nextToken());
                    System.out.println(dynamicArray.get(pos - 1));
                    break;
            }
        }

    }
}
