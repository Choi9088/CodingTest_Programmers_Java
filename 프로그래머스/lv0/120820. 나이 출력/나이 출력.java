class Solution {
    public int solution(int age) {
        int answer = 2022 - age + 1;
        return answer;
    }
}

//2022년에 태어나면 1살, 21년에 태어났으면 2살
//식으로 정리하면
//2022 - 2(나이만큼 빼주기) + 1(태어난 그 해에 바로 1살이 되니까 더해주기) = 2021
