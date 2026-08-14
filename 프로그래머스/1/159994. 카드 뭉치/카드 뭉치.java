import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        String answer = "Yes";
        // 묶어서 비교해야되나?
        // 순서 상관 없이 1, 2, ... n개 단어뭉치 가져다가
        // goal 단어뭉치랑 일치하는 거 있는지 확인하면 될 것도

        // 배열에서 뭉치(문자열) 만드는 로직
        // 크기가 1~10이면.. 10+9+...+1 이면 55가지인데
        // 이걸 다 반복해서 비교..?
        // 각 배열마다 3*55가지.. 이고 이걸 또 비교하는 로직이면 시간 엄청 늘 것 같은데
        // 애초에 세 단어 이상 합성어를 비교할 필요가 있나?
        // 순서 한 번이라도 꼬이면 못 만드는 거니까.. cards1 안이던 cards2 안이던 안 맞으면 No
        // 이러면 판별을 어떻게 하느냐인데..

        // 어차피 순서는 1 -> 2 니까.. 1이랑 goal 이랑 첫 인덱

        // 아니면 정답 비교용 인덱스 변수 두고..
        // c1 c2 오가면서 확인할 수 있는 방법 없을까

        // 각 배열별로 순서 세는 인덱스 별도로 두고
        // goal 배열 반복하면서 ..
        // cards1, cards2 에서 단어 찾아가면서 있으면 각 인덱스 ++
        // 둘 다 없는 경우 발생하면 No
        // goal 끝까지 다 돌면 Yes..

        int idx1 =0, idx2 = 0, goalIdx = 0;

        while(goalIdx < goal.length){
            if(idx1 < cards1.length &&(goal[goalIdx]).equals(cards1[idx1])){
                idx1++;
                goalIdx++;
            } else if(idx2 < cards2.length && goal[goalIdx].equals(cards2[idx2])){
                idx2++;
                goalIdx++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}