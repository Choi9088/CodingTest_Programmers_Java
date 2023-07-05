class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0 ; i < n+1 ; i++){
            if(i%2 == 0){
                answer += i;
            }
        }
        
        return answer;
    }
}


/*
1. 0부터 n까지 하나씩 불러오기 : for
2. 불러온 수가 짝수인지 확인하기 : if(), %
    2-1. 짝수면 answer에 값 누적시키기
    2-2. 홀수면 1 로 돌아가기
*/