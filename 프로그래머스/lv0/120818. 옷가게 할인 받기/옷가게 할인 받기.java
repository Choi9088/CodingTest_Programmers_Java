class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price>=100000 && price<300000){
            answer = (int)(price*0.95);
        }else if(price>=300000 && price<500000){
            answer = (int)(price*0.9);
        }else if(price >= 500000){
            answer = (int)(price*0.8);
        }else { //질문하기에서 힌트 얻어서 추가한 코드
            answer = price; 
        }
            
        return answer;
    }
}

//테스트 일부가 실패하길래 질문하기에 들어가봤는데,
//할인적용이 안 되는 범위(10만원 미만)에 대한코드가 없어서 오류가 나는거일수 있다고 하셔서 마지막 코드추가!


//        if(price>=500000) return (int)(price*0.8);
//        if(price>=300000) return (int)(price*0.9);
//        if(price>=100000) return (int)(price*0.95);

//이렇게 간단하게도 코드작성가능...