import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 정답 배열
        int[] answer = new int[photo.length];
        // 정답 넣기 위한 인덱스
        int aIdx = 0;
        
        // 반복문으로 제시된 photo 배열 속 원소(1차원 배열) 꺼내기
        for(String[] j : photo) {
            // 정답에 넣기 위한 합계 변수
            int sum = 0;
            // name 에 제시된 이름 꺼내기
            for(String i : name) {
                // photo 1차원 배열에 이름이 있는지 검사하고 
                // 정답 이름 Set 하나 만들기
                Set<String> set = new HashSet<>();
                for(String k : j){
                    if(k.equals(i)) {
                        set.add(k);
                    }
                }
                
                // 정답 이름 셋이랑 yearning 배열 비교해서 
                // 있으면 해당 값 합계에 더해주기
                for(String ans : set){
                    int idx = 0;
                    for(String n : name) {
                        if(ans.equals(n)){
                            sum += yearning[idx];
                        }
                        idx++;
                    }
                }
            }
            // 정답 배열에 값 넣고 다음 원소로
            answer[aIdx] = sum;
            aIdx++;
        }
        return answer;
    }
}