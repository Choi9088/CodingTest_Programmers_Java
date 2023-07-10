class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for(int i = 0 ; i < str1.length() ; i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }
        
        return answer;
    }
}



/*
위 코드에서 for문안의 answer 두 줄을 단순하게 
answer += str1.charAt(i) + str2.charAt(i);
로 바꾸면 숫자로 변환되어 원하는 값이 나오지 않는다.

아래와 같이 ""를 같이 더해 결과값이 String으로 나올 수 있게 해야한다
answer += "" + str1.charAt(i) + str2.charAt(i);

*/