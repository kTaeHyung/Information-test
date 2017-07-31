package kr.rtruesoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test002 {
    public static void main(String[] args) throws IOException
    {
        String strTemp;
        String[] strArr;
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("파싱할 문자열 입력 (컴마구분) : ");
        strTemp = br.readLine();

        // StringTokenizer 클래스  인스턴스 생성
        StringTokenizer st = new StringTokenizer(strTemp,",");
        System.out.println(st.countTokens());
        // 테스트
        //--==>> 3

        strArr = new String[st.countTokens()];
        n = 0;

        while(st.hasMoreTokens())
        {
            strArr[n++] = st.nextToken();
        }

        System.out.println();
        System.out.print("파싱될 문자열 : ");
        for(String s  : strArr)
        {
            System.out.print(s+"  ");
        }
        System.out.println();


    }
}
