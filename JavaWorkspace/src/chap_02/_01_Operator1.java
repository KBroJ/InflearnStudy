package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // <산술연산자>
        // 1. 일반연산(+,-,*,/,%)
        System.out.println(4+2); // 6
        System.out.println(4-2); // 2
        System.out.println(4*2); // 8
        System.out.println(4/2); // 2

        System.out.println(5/2); // 2 소수점은 버려진다.
        System.out.println(2/4); // 0

        System.out.println(4%2); // 0 / % : 나누고 남은 나머지 표시

        // 2. 우선 순위 연산
        System.out.println(2+2*2); // 2 + 4 => 6
        System.out.println((2+2)*2); // 4 * 2 => 8
        System.out.println();

        // 3. 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30
        c= a - b;
        System.out.println(c); // 10
        c = a * b;
        System.out.println(c); // 200
        c = a / b;
        System.out.println(c); // 2
        c = a % b;
        System.out.println(c); // 0
        System.out.println();

// ====================================================================================
        // <증감연산>
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 10 + 1 => sout 작동
        System.out.println(val); // 11
        System.out.println();

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10출력 => 11+1
        System.out.println(val); // 11
        System.out.println();

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9
        System.out.println();

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9
        System.out.println();

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3
    }
}
