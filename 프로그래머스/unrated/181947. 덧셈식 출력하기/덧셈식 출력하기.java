import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        
        System.out.print(a + " + " + b + " = " + c);
        
        //다른 사람의 풀이!!
        //System.out.printf("%d + %d = %d",a,b,a+b);
    }
}