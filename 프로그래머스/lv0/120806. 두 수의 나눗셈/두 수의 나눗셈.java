class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1/num2*1000; // int를int로 나누면 int가 되어버리므로 두 변수모두 또는 한 변수를 double로 바꿔줘야 소수점아래까지 손실없이 계산됨.
        return (int)answer; //double을 int로 형변환시켜 소수점아래의 숫자를 제거할 수 있음.
    }
}
