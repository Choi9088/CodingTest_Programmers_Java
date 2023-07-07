class Solution {
    public String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        return answer;
    }
}

/*replace() 메서드를 사용하여 문자를 빈 문자열로 바꾸면 Java의 문자열에서 문자의 모든 인스턴스를 제거할 수 있습니다. 다음 예제 코드는 주어진 문자열에서 소문자 "a”를 모두 제거합니다.

String str = "abc ABC 123 abc";
String strNew = str.replace("a", "");
Output
bc ABC 123 bc*/