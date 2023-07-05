class Solution {
    public int solution(int n, int k) {
        k = k-(n/10);
        int answer = (n*12000)+(k*2000);
        return answer;
    }
}

/*
1. 서비스 음료의 수 = n인분/10
2. 계산해야할 음료수의 수(k) = k - (n/10)
3. 총 계산해야할 금액 = (n *12000) + (k*2000)
*/