class Solution {
    public int solution(int n) {
        int answer = 1;
         while(true){
            if(6*answer%n==0) break;
            answer++;
        }
        return answer;
    }
}

/*
피자를 한 판씩 늘려갈거야 한 판을 늘릴때마다 조각의 수는 6씩 증가하겠지
이때, 이 조각의 수를 n 명으로 나눈값이 0으로 떨어질때 까지(조각의 수%6==0)while을 반복할거야
*/