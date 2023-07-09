class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a; 
        int b;
        //장군(a) 5, 병정(b) 3, 일(c) 1
        if(hp>=5){
            a = hp/5;
            hp = hp%5;
            answer += a;
        }
        if(hp>=3){
            b = hp/3;
            hp = hp%3;
            answer += b;
        }
        if(hp<3){
            answer += hp; 
        }
        
        return answer;
    }
}