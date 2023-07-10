class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String temp1 = String.valueOf(a) + String.valueOf(b);
        String temp2 = String.valueOf(b) + String.valueOf(a);
        
        if(Integer.valueOf(temp1) >= Integer.valueOf(temp2)){
            answer = Integer.valueOf(temp1);
        }else{
            answer = Integer.valueOf(temp2);
        }
        
        return answer;
    }
}