package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

    // <문자열 비교>

        String s1 = "Java";
        String s2 = "Python";

        /*
            1. equals() : 문자열 내용이 같으면 true, 다르면 false
            * 대소문자를 구분한다.
            * equalsIgnoreCase : 대소문자 구분없이 문자열값을 비교
         */
        System.out.println(s1.equals("Java")); // true
        System.out.println(s2.equals("python")); // false, 대소문자 구분함
        System.out.println(s2.equalsIgnoreCase("python")); // true, 대소문자 구분안함
        System.out.println();

    // <문자열 비교 심화>
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true, 값(내용)을 비교
        System.out.println(s1 == s2); // true, 참조하는 곳(주소)을 비교
        System.out.println();

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // fasle

    }
}
