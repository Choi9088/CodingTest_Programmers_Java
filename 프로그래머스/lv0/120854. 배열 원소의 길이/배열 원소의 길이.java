class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; //1. strlist크기만큼 answer배열 초기화
        
        for(int i = 0 ; i < strlist.length ; i++){ //2. strlist크기만큼 반복
            answer[i] = //4. answer[i]번째 값에 저장
                strlist[i].length(); //3. strlist[i]번째값의 length를 구해서  
        }
        
        return answer;
    }
}
/*
1. strlist의 0~length[] 까지의 값을 불러와
2. strlist[]의 길이를 구해 
3. 위 값을 answer[]에 순서대로 넣어
*/