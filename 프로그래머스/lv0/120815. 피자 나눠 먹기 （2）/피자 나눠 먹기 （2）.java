class Solution {
    public int solution(int n) {
        int answer = 1;
         while(answer*6%n != 0){ //6으로 나눠떨어지지않으면 나눠떨어질때까지 반복해라!
            answer++; //나눠떨어지지 않으면 피자의 수를 계속 늘려라!
        }
        return answer;
    }
}

/*
while문은 괄호안의 조건식이 참일경우에 계속 반복

피자 한판(answer)은 6조각, 총 조각의 수(answer*6)를 n명으로 나눴을때
1) 0이 아닌경우 피자의 수를 늘린다음 while문을 반복한다 >> (answer*6)%n !=0
2) 0이 나온경우 그 피자의 수를 출력한다.

나는 실수로 조건식을 반대로((answer*6)%n ==0)적어서 답이 안 나왔었음...
*/