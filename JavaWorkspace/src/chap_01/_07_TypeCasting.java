package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

    /*
        <TypeCasting : 형변환>
        정수형 < == > 실수형
     */
        // int to float, double
        int score = 93; // 정수
        System.out.println(score); // 93
        System.out.println((float) score); // 정수형 => 실수형 : 93.0
        System.out.println((double) score); // 정수형 => 실수형 : 93.0

        // float, double to int
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        // ★ 실수형 변수에 int 연산 시 int의 값은 자동으로 형변환 된다
        score_d = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d); // 191.8

    /*
        변수에 형변환된 데이터 집어넣기
           1. <자동 형변환> : 데이터 저장범위가 더 넓은 자료형으로 값 주입 시 자동 형변환 된다.
             int > long > float > double

           2. <수동 형변환> : 데이터 저장범위가 더 적은 자료형으로 값 주입 시 수동 형변환 해줘야 한다.
            double > float > long > int

     */
        // int형값을 double형으로 주입
        double convertedScoreDouble = score; // 191 -> 191.0 : 자동 형변환

        // double형을 int형으로 주입
        int convertedScoreInt = (int)score_d; // 191.8 -> 191 : 수동 형변환


// ==================================================================================================
        // [숫자(정수) => 문자열] 로 변환
        // 방법 1.
        String s1 = String.valueOf(93); // String클래스의 valueOf메소드를 통해 
        System.out.println(s1); // 93
        // 방법 2.
        s1 = Integer.toString(93);
        System.out.println(s1);

        // [숫자(실수) => 문자열] 로 변환
        // 방법 1.
        String s2 = String.valueOf(98.8); // [숫자(실수) => 문자열] 로 변환
        System.out.println(s2); // 98.8
        // 방법 2.
        s2 = Double.toString(98.8);
        System.out.println(s2); // 98.8

        // [문자열 => 숫자로]
        int i = Integer.parseInt("93"); // ★★★★
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

    }
}
