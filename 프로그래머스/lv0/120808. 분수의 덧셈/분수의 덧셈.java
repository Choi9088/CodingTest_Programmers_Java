class Solution {
        //2-1. 먼저 최대 공약수(gcd)를 구하고
    public int GCD(int num1, int num2){ //분자(num1), 분모(num2)를 매개변수로 받은다음
        if(num1 % num2 == 0) { //분자가 분모로 나눠떨어진다면 분모값이 최대공약수가 됨 
            return num2;
        }
        return GCD(num2, num1 % num2); //분모로 나눠떨어지지 않는다면 유클리드 알고리즘을 반복해 최대공약수가 나올때 까지 반복한다. 
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //1. 분모, 분자의 합 구하기
        int numer = (numer1*denom2) + (numer2*denom1);
        int denom = denom1 * denom2;
        
        //2. 기약분수 구하기 : 분자, 분모를 최대공약수로 나눠줘야함. 그러려면...
        
        int gcd = GCD(numer, denom); //유클리드 알고리즘으로 구한 최대공배수 
        
        //2-2. 분자, 분모를 각각 최대공약수로 나눠주기
        numer /= gcd;
        denom /= gcd;
        
        //3. 계산된 분자, 분모를 배열에 삽입
        int[] answer = {numer, denom};
        
        return answer;
    }
}