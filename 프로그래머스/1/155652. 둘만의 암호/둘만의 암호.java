class Solution {
    public String solution(String s, String skip, int index) {

        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();

        // 인덱스만큼 전진시키기
        for(int i = 0; i < sArr.length; i++) {
            int idx = index;
            int nAlpha = sArr[i];
            // 스킵해야 할 알파벳이 있다면 스킵
            // 다만 스킵하고 지나간 뒤에 나온 알파벳도 스킵인지 아닌지 판별 필요
            // 인덱스만큼 전진시키지만 스킵해야 할 알파벳을 만나면 인덱스 감소시키지 않기?
            while(idx > 0) {
                nAlpha++;
                // z 넘어가면 a부터 다시 출력
                if(nAlpha > 122) {
                nAlpha = (nAlpha-97)%26 + 97;
            }
                // 전진시킨 알파벳이 스킵해야 할 알파벳인지 판별
                // 아니라면 index--, 한번 더 전진시키기
                // 맞다면 index 변화 없음, 한번 더 전진시키기
                if(!isSkip(nAlpha, skipArr)){
                    idx--;
                }
                
            }
            
            sArr[i] = (char)nAlpha;
        }

        String answer = new String(sArr);
        return answer;
    }
    
        public boolean isSkip(int alpha, char[] arr) {
        for(char c : arr) {
            if (c == alpha) {
                return true;
            }
        }
        return false;
    }
}