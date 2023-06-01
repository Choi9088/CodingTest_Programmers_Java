class Solution {
    public int[] solution(int[] numbers) { //1. numbers배열을 변수로 입력
        int[] answer = new int[numbers.length]; //2. 두배로 만든 배열을 넣어줄 같은길이의 새로운 배열생성
        for(int i=0; i < answer.length ; i++){ 
            answer[i] = numbers[i]*2; //3. 새로운 배열에 기존배열값 *2 값을 차례대로 넣어줌
        }
        return answer;
    }
}