class Solution {
    public int[] solution(int money) {
        int a = money/5500;
        int b = money%5500;
        int[] answer = {a, b};
        return answer;
    }
}

/*
money/5500 = 마실수 있는 아메리카노의 수
money%5500 = 잔돈
이걸 배열로 넣어야해
*/