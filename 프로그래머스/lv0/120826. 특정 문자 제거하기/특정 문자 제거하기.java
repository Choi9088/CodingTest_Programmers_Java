class Solution {
    public String solution(String my_string, String letter) {
        /* 1. 반복문이랑 charAt으로 */
        String answer = "";
        
        for (int i=0; i<my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        
        /* replace 함수 활용하기 
        String answer = my_string.replace(letter, "");
        return answer;
        */
        
        return answer;
    }
}