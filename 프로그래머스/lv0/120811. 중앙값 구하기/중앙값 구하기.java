import java.util.Arrays; //프로그래머스에서도 임포트 해줘야함..

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); //배열 오름차순으로 정렬
        int answer = array[array.length/2]; //중앙값 출력하기
        return answer;
    }
}