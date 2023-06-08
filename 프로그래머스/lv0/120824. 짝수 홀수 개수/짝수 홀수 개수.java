class Solution {
    public int[] solution(int[] num_list) {
        int a = 0; //짝수의 개수
        int b = 0; //홀수의 개수
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2 == 0){ //짝수인 경우
                a++; //a 증가
            }else{ //홀수인 경우
                b++; //b 증가
            }
        }
        int[] answer = {a, b};
        return answer;
    }
}