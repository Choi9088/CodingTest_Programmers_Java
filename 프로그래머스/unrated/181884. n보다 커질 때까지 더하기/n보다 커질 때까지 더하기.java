class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        for(int i = 0 ; i < numbers.length ; i++){
            answer += numbers[i];
            if(answer>n){break;}
        }
        
        return answer;
    }
}


/*
while을 사용해보고싶었는데, 초기값이 항상 n 보다 작기때문에 배열의 합이 실행되지않음
*/