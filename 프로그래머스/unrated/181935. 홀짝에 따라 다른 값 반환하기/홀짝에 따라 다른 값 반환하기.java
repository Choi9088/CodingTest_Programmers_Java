class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n%2 != 0){ // 홀수인 경우
            for(int i = 1 ; i < n+1 ; i += 2){
                answer += i;
            }        
        }else{
            for(int i = 2 ; i < n+1 ; i += 2){
                answer += i*i;
            } 
        }

        
        return answer;
    }
}


/* 첫 번째 풀이 : 너무 너저분하고 마음에 안들어서 다른사람 풀이보고 참고해서 재도전

for(int i = 1 ; i < n+1 ; i++){
    if(n%2 != 0){
        if(i % 2 != 0){
            answer += i;                
        }
    }else{
        if(i%2 == 0){
            answer += i*i;
        }
    }
}

*/