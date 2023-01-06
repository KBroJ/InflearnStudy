package chap_01;

// 변수
public class _03_Variables {

    public static void main(String[] args) {
        // 변수 없을 때
        System.out.println("나도코딩님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println("나도코딩님, 배송이 완료되었습니다.");

// ===================================================================================

        // 변수 선언
        String name; // 문자열 변수 선언
        name = "나도코딩";
        // String name = "나도코딩"; // 문자열 변수 생성과 동시에 초기값 설정

        int hour = 15; // 정수형 변수 생성 + 초기값(15) 설정

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

// ===================================================================================
        double score = 90.5; // 실수형 변수 생성 및 초기값 설정
        char grade = 'A'; // 문자 변수 선언 및 초기값 설정
        name = "강백호"; // name 변수 값 변경

        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");



    }

}
