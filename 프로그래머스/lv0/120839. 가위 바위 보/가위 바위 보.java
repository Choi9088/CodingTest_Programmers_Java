class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0 ; i < rsp.length(); i++){
            if(rsp.charAt(i) == '2') { 
                answer += '0';
            } else if(rsp.charAt(i) == '0') { 
               answer += '5';
            } else { 
                answer += '2'; 
            }
        }
        return answer;
    }
}
/*
s 가위(2) > 바위(0)
r 바위(0) > 보(5)
p 보(5) > 가위(2)

입력받은 문자열(String) rsp를 배열로 바꿔주고 (for, charAt)
각 배열의 값을 비교해서 필요한 값으로 바꿔주고 (swith) 
배열을 String으로 출력하기(for)

*/