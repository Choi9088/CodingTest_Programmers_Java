class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1차 코드는 시간초과로 실패했고, 질문하기에서 힌트 얻어서 성공
        // a * b = n 이 되는값의 쌍을 구해야하는거니까, 역으로 n을 a로 나눈값이 나머지없이 딱 떨어진다는것
        // 그래서,
        //for문을 한번만 사용하고, if조건식을 n%a == 0 으로 변경
        for(int a = 1 ; a <= n ; a++) {
            if(n % a == 0) {answer++;
            }
        }   
        return answer;
    }
}

/*
순서쌍의 개수 = answer
중첩for문으로 a * b = n 이 되는값을 구하고, 
    a = 1 ~ n 까지 증가
    b = n ~ 1 까지 감소
if문으로 a * b = n 이 된 경우에
answer 를 1씩 증가시키도록 구현
*/

/* 1차 코드 : 시간초과로 실패
        for(int a = 1 ; a <= n ; a++) {
            for(int b = n ; b >= 1 ; b--){
                if(n % b == 0) {
                    answer++;
                }
            }
        }
*/