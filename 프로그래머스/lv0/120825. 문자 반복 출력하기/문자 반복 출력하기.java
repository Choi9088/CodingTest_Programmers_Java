class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        //3. 1~2 과정을 문자열 길이만큼 반복시키기
        for(int j = 0 ; j<my_string.length() ; j++){

            //1. my_string 문자열에서 순서대로 한 문자씩 불러오기
            char ch = my_string.charAt(j);

            //2. 불러온 문자를 n 회 반복해서 String에 누적시키기
            for(int i = 0 ; i<n ; i++){
                answer = answer + ch;
            }
        }
        return answer;
    }
}


/* 첫 번째 아이디어 : 
1. my_string 문자열에서 순서대로 한 문자씩 불러오기
    char ch = my_string.charAt(int index)
2. 불러온 문자를 n회 반복해서 String answer에 누적시키기
    answer += ch;
*/