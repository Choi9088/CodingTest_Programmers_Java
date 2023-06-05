class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length]; //num_list와 동일한 크기의 배열 선언
        for(int i = 0; i<num_list.length ; i++){ //answer배열의 index 0 ~ (리스트 크기-1)만큼 반복
            answer[i] = num_list[num_list.length-i-1]; //answer배열의 0부터 num_list값을 넣어준다.
        }
        return answer;
    }
}

//num_list.length-i-1 인 이유알아보기(노가다)

//num_list의 크기가 5일때(index 0~4)
//반복문 첫 수행시 : 5 - 0 -1 = 4
//두번째 : 5 - 1 - 1 = 3
//세번째 : 5 - 2 - 1 = 2
//네번째 : 5 - 3 - 1 = 1
//다섯번째 : 5 - 4 - 1 = 0
//마지막 : i 가 num_list.length인 5와 같아지므로 for문이 종료됨
