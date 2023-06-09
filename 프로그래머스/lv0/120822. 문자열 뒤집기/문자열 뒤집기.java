class Solution {
    public String solution(String my_string) {
    // 1. 반복문 사용
        
        String answer = "";
        for(int i=my_string.length()-1;i>=0;i--){
            answer = answer + my_string.charAt(i);
        }
        return answer;
        
        
    //2. Stringbuilder클래스 reverse()사용
        /*
        StringBuilder answer = new StringBuilder(my_string).reverse();
        return answer.toString();
        */
        
    //3. StringBuffer클래스 reverse()사용
        /*
        StringBuffer answer = new StringBuffer(my_string).reverse();
        return answer.toString();
        */
    }
}