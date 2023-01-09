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
           1. <자동 형변환>
             int > long > float > double

           2. <수동 형변환>
            double > float > long > int

     */
        double convertedScoreDouble = score; // 191 -> 191.0 : 자동 형변환

        int convertedScoreInt = (int)score_d; // 191.8 -> 191 : 수동 형변환

    }
}
