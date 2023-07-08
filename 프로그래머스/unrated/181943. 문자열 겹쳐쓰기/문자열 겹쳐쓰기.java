class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) 
                        + overwrite_string 
                        + my_string.substring(s+overwrite_string.length());
        return answer;
    }
}

/*
my_string을 0부터 -s꺄지만 가져오고 : String.substring(start,end)
거기에 over~ 를 붙이라는거네... 가 아니구나..?

index s번째부터 overwite_string으로 바꾸라는거였네?!

1. my_string s 만큼 가져오고
2. overwrite 가져오고
3. 앞에 있는 s 길이 + overwrite 길이부터 my_string을 가져와서 합치기
*/

/*substring 사용법
String.substring(start) //문자열 start위치부터 끝까지 문자열 자르기
String.substring(start,end) //문자열 start위치 부터 end전까지 문자열 발췌
*/		