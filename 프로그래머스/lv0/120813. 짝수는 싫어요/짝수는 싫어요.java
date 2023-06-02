class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2]; // 배열을 먼저 선언했고(n+1은 홀수로 값이들어온경우를 대비)
        int index = 0; // 인덱스 변수 선언
        
        for(int i=1; i<=n; i++){ //1부터 n까지 반복
            if(i%2 != 0){ //값이 홀수라면
                answer[index] = i; //그 값을 배열에 넣고
                index++; //인덱스를 1 증가시킨다
            } //값이 짝수라면 배열에 넣는것도, 인덱스값 증가도 pass하게 됨
        }
        
        return answer;
    }
}