class Solution {
    public int solution(int n) {
        int answer = 0; //필요한 피자의 수
        if(n%7 == 0){
            answer = n/7; //인원을 7로 나눠서 떨어지면 그 몫이면 충분하고
        }else{
            answer = (n/7)+1; //인원을 7로 나눴는데 나머지값이 생긴다면 1판을 추가해야해
        }
        return answer;
    }
}

//다름 사람의 풀이

//    public int solution(int n) {
//        int answer = (n%7==0) ? n/7 : n/7 + 1;
//        return answer;
//    }

//조건 ? 참인경우반환값 : 거짓인경우반환값
