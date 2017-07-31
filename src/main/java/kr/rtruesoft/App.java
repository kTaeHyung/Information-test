package kr.rtruesoft;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // 주요 변수 선언
        Scanner sc = new Scanner(System.in);

        int a, b;
        int tot;
        // 사용자에게 안내메세지 출력
        System.out.print("첫번째 수를 입력하세요 : ");
        a = sc.nextInt();
        System.out.print("두번째 수를 입력하세요 : ");
        b = sc.nextInt();

        tot = a + b;

        System.out.println("두수의 합 : " + tot);
    }
}
