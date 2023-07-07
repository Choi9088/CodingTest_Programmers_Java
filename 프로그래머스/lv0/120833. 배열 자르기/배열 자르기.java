class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int a = 0;
        
        for(int i = num1 ; i < (num2+1) ; i++){
            answer[a] = numbers[i]; 
            a++;
        }
        
        return answer;
    }
}


/*
신박한 방법이 따로 있을듯하긴하지만..
단순하게 생각하면 num1번째 배열값 ~ num2번째 배열값 까지 불러서 새 배열에 넣으면 되는거 아님?
*/


/* 다른 사람의 풀이 : 
    answer변수를 먼저 선언하지않고, for문 안에서 선언하는것도 가능
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for(int i = num1, j = 0; i < num2+1; i++) {
            answer[j] = numbers[i];
            j++;
        }
        return answer;
    }
}
*/