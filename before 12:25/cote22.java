package cote;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * cote22
 */
public class cote22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++) {
            for(int y=0; y<a; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        StringBuilder sb = new StringBuilder();
        //StringBuilder는 문자열을 수정할 때 사용하는 클래스로,
        //기본 String 클래스에 비해 문자열 조작 연산이 빠르다.
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        //연속된 정수를 스트림으로 생성한다. 생성된 스트림의 각 정수 값에 대해
        //주어진 람다 함수를 실행 하고 각 정수에 대해 실제 동작을 하지 않고 StringBuilder
        //객체 sb에 *을 추가한다(append()) 결과적으로 a개의 *문자가 sb에 추가된다.
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
        //sb에 저장된 문자열 b 행의 a 개의 * 문자가 출력된다.
    }
}
