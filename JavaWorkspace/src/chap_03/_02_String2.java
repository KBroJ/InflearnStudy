package chap_03;

public class _02_String2 {

    public static void main(String[] args) {

        String s = "I like Java and Python and C.";

    // <문자열 변환>

        // 1. [변수명].replace("[변환하고자 하는 문자]", "[변환 문자]")
        System.out.println(s.replace(" and", ","));// and를 ,로 변환
        System.out.println();

// ==============================================================================================================================
        // 2-1. [변수명].substring([시작 인덱스 숫자]) : 문자열 중 시작위치를 정하여 출력
        // * 인덱스는 문자열에서 [왼쪽 -> 오른쪽]으로 0부터 시작한다.
        System.out.println("Java 위치 인덱스 값 : " + s.indexOf("Java")); // 특정 문자 위치정보 찾기 : 7
        System.out.println(s.substring(7)); // 인덱스 기준 7번쨰 부터 출력 시작(이전 내용은 삭제)
        // * 두 메소드를 사용하여 특정 문자부터 표출 시작
        System.out.println(s.substring((s.indexOf("Java")))); // 위의 두 메소드 합쳐서 사용하기
        System.out.println();

        // 2-2. [변수명].substring([시작 인덱스 숫자], [끝 위치]) : 문자열 중 시작위치, 끝 위치를 정하여 출력
        // * [시작 위치]부터 [끝 위치 "직전"]까지 출력
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // "Java"가 시작하는 위치부터, "."이 시작하는 바로 앞까지
        System.out.println();

// ==============================================================================================================================
        // 3. [변수명].trim() : 변수의 앞뒤 공백 제거
        s = "      I love Java.      ";
        System.out.println("공백 제거 전 : " + s);
        System.out.println("공백 제거 후 : " + s.trim());
        System.out.println();

// ==============================================================================================================================
        // 4. [변수명].concat([추가할 문자]) : 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println("문자열 결합 방법 1. '+' : " + s1+s2); // JavaPython
        System.out.println("문자열 결합 방법 1. '+' : " + s1 + ", " + s2); // Java, Python
        System.out.println();

        System.out.println("문자열 결합 방법 2. 'concat' : " + s1.concat(", ").concat(s2)); // Java, Python

    }

}
