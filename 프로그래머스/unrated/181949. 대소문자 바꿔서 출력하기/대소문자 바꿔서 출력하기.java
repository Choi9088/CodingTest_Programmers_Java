import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0 ; i < a.length() ; i++){ //2. String a의 길이만큼 반복할거야
            char ch = a.charAt(i); //1. String a 에서 한 문자씩 가지고올건데
            if(Character.isUpperCase(ch)){ //3. 가지고 온 문자가 대문자라면
                answer += Character.toLowerCase(ch); //4. 소문자로 바꿔줄거고
            }else{ //5. 그게 아니라면(=소문자인 경우)
                answer += Character.toUpperCase(ch); // 6. 대문자로 바꿔서 answer에 누적시킨다
            }
        }         
        System.out.println(answer);
    }
}