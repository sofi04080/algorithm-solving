class Solution {
    public int solution(int n, int m, int[] section) {
        // 인덱스 변수를 별도로 두고
        // 배열의 첫 원소를 인덱스로 변경 + 롤러 크기만큼 탐색 + 횟수 변수 ++
        // 인덱스 + 롤러 크기 이상인 배열 원소가 있으면 추가로 횟수 변수 ++, 없으면 끝
        // 이러면 롤러 크기 1일때가 문제긴 하네.. 1이면 ++ 하고 2부터, ..
        // 롤러 크기 4면.. 1부터 시작해서 4까지잖어? 그러면 롤러 길이-1 만큼 하고 ++해주기?
        
        // idx 는 롤러가 시작하는 위치
        int idx = 0;
        int answer = 0;
        idx = section[0];
        for(int  i : section) {
            if(idx <= i) {
                idx = i;
                idx = idx + m;
                answer++;
            }
        }
        return answer;
    }
}