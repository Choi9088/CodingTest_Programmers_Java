import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "*";
        
        for(int i =0;i<n;i++){
            System.out.println(star);
            star += "*";
        }
    }
}

/*
n개의 열 만큼 별 모양을 출력 해야하는데

1~n 번까지 반복
1번째 반복에서는 * 한개만 출력하고
반복 될 때마다 * 하나씩을 추가시킨다

*/