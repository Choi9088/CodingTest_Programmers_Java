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

/*
 다른사람의 풀이 일부 : 
 
 int temp1 = Integer.parseInt(""+a+b);
 
 1. (""+a+b) : Int값을 String고 + 하면 String으로 자동 형 변환됨!
 2. Integer.parsseInt() : String값을 Int로 변환하기
 
 알고있었던 내용들인데 활용 못 했길래 메모추가!!
 
 */