package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

    /*
        어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오
        조건
            1. 키가 120cm 이상인 경우에만 탑승 가능
            2. 삼항 연산자 사용
        실행결과
            키가 [115/121]cm 이므로 탑승 [불가능/가능]합니다.
     */
        int a = 115;
        int b = 121;
        System.out.println("키가 " + a + "cm 이므로 탑승 " + (a >= 120 ? "가능" : "불가능") + "합니다");
        System.out.println("키가 " + b + "cm 이므로 탑승 " + (b >= 120 ? "가능" : "불가능") + "합니다");
        System.out.println();

        // Answer
//        int height = 115;
        int height = 121;
        String result = (height >= 120 ? "탑승 가능합니다" : "탑승 불가능합니다");
        System.out.println("키가 " + height + "cm 이므로 " + result);


    }
}
