package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
    /*
        1. 상수는 값이 변하지 않는 변수로 앞에 final 을 작성해야 한다.
        2. 변수명은 영어대문자로 보통 작성된다
        3. 두 단어 이상일 경우 가독성을 위해 _로 구분하여 작성한다.
     */

        final String KR_COUNTRY_CODE = "+82"; // 국가 번호
//        KR_COUNTRY_CODE = "+8282"; // 해당 변수는 상수(final)이기 때문에 값 변경 불가능
        System.out.println(KR_COUNTRY_CODE);
        
        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "1992-10-16"; // 생년 월일

    }
}
