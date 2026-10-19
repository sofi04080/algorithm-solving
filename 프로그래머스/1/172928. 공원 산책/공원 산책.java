class Solution {
        public int[] solution(String[] park, String[] routes) {
        // park 를 분해해서 2차원 배열로 만들기? 아니면.. 다른 방법이 있나
        // 우선.. 분해해서 담을 문자 배열
        char[][] parkAns = new char[park.length][park[0].length()];

        // 2차원 배열로 복사
        for(int i = 0; i < park.length; i++) {
            char[] parkInfo = park[i].toCharArray();
            // arraycopy가 뭐시여
            for(int j = 0; j < park[0].length(); j++){
                parkAns[i][j] = parkInfo[j];
            }
        }

        // 시작 인덱스랑 이동한 인덱스 저장할 변수가 필요한데
        // 그냥 두칸짜리 배열 만들어서?
        int[] pos = new int[2];
        // 얘도 뭔가 간소화 내지 다른 방법 있지 싶긴 한데..
        for(int i = 0; i < park.length; i++) {
            for(int j = 0; j < park[0].length(); j++){
                if(parkAns[i][j] == 'S') {
                    pos[0] = i;
                    pos[1] = j;
                }
            }
        }

        // 경로 계산하기
        for(int i = 0; i < routes.length; i++) {
            moving(routes[i], pos, parkAns);
        }

        int[] answer = {pos[0], pos[1]};
        return answer;
    }

    public void moving(String routes, int[] pos, char[][] park) {
        char[] route = routes.toCharArray();
        char dir = route[0];
        int move = route[2] - '0'; // 문자를 정수로 변환

        if (dir == 'E') {
            // 이동을 마쳤을 경우 공원 밖을 벗어나는가?
            if (!(pos[1] + move >= park[0].length)) {
                // 이동 중 장애물을 마주치는가?
                for (int i = 1; i <= move; i++) {
                    if (park[pos[0]][pos[1] + i] == 'X') {
                        return;
                    }
                }
                pos[1] = pos[1] + move;
            }
        } else if (dir == 'W') {
            if (pos[1] - move >= 0) {
                for (int i = 1; i <= move; i++) {
                    if (park[pos[0]][pos[1] - i] == 'X') {
                        return;
                    }
                }
                pos[1] = pos[1] - move;
            }
        } else if (dir == 'N') {
            if (pos[0] - move >= 0) {
                for (int i = 1; i <= move; i++) {
                    if (park[pos[0] - i][pos[1]] == 'X') {
                        return;
                    }
                }
                pos[0] = pos[0] - move;
            }
        } else if (dir == 'S') {
            if (!(pos[0] + move >= park.length)) {
                for (int i = 1; i <= move; i++) {
                    if (park[pos[0] + i][pos[1]] == 'X') {
                        return;
                    }
                }
                pos[0] = pos[0] + move;
            }
        }
    }
    
    
}