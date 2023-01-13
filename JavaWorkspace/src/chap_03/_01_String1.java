package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {

// <문자열>
        // * Tip : IntelliJ에서는 문자열을 드래그 하면 화면 오른쪽 하단에 [00 char] 글자수를 알려준다.
        String s = "I like Java and Python and C.";
        System.out.println(s);

    // 문자열의 길이 : length()
        System.out.println(s.length()); // 29

    // 대소문자 변환
        // 1. 대문자로 변환 : toUpperCase()
        System.out.println(s.toUpperCase());

        // 2. 소문자로 변환 : toLowerCase()
        System.out.println(s.toLowerCase());

    // 포함 관계
        // 1. contains() : 특정 문자를 포함한다면 true / 포함하지 않는다면 false
        System.out.println(s.contains("Java")); // true
        System.out.println(s.contains("C#")); // false

        /*
            2.
                1) indexOf() : 특정 문자의 위치(* 문자열의 첫번째 위치는 0부터 시작하며 왼쪽부터 오른쪽으로 증가한다.)
                    * 찾고자 하는 문자가 없을 경우 -1 반환한다.
                    * 찾고자 하는 문자가 여러개일 경우 첫번째 위치를 출력한다.

                2) lastIndexof() : 찾고자 하는 문자가 여러개일 경우 마지막 문자열 위치를 알고 싶을 때 쓴다
         */
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1 : 해당 문자 없음
        System.out.println(s.indexOf("and")); // 12 : 처음 만나는 and의 위치정보
        System.out.println(s.lastIndexOf("and")); // 23 : 마지막 일치하는 위치 정보

        /*
            3. 문자이 특정 문자열로 [시작/끝] 하는지 확인 : true / false
                1) startsWith() : 특정 문자로 시작하는지 확인
                2) endsWith() : 특정 문자로 끝나는지 확인
         */
        System.out.println(s.startsWith("I like")); // true
        System.out.println(s.endsWith(".")); // true




    }
}
