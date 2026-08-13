import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> index = new HashMap<>();

        // 속도를 위해 자료형 변경
        for(int i = 0; i < players.length; i++) {
            index.put(players[i], i);
        }

        for(String str : callings) {
            int i = index.get(str);

            String s1 = players[i-1];
            players[i-1] = str;
            players[i] = s1;
            
            // 맵도 위치 변경
            index.put(str, i-1);
            index.put(s1, i);
        }
        String[] answer = players;
        return answer;
    }
}