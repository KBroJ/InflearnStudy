package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {

        /*
            <SwitchCase>

            석차에 따른 장학금 지급
            1등 : 전액 장학금
            2등 : 반액 장학금
            3등 : 반액 장학금
            그 외 : 장학금 대상 아님
        */

        int ranking = 1; // 1등
        ranking = 2;
        ranking = 3;
        ranking = 4;

        // 방법 1. If Else문 이용
        if(ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
//        } else if (ranking == 3) {
//            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");
        System.out.println();

// ========================================================================
        /*
        방법 2. Switch Case문을 이용

         switch ( 변수 ) {
            case A : ... 수행할 명령 ...
                break;
            case B : ... 수행할 명령 ...
                break;
            case C : ... 수행할 명령 ...
                break;
                ...
            default : ... 위의 조건 그 외의 경우 수행할 명령 ...
        }
         */
        ranking = 3;

        switch ( ranking ) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
                System.out.println("반액 장학금");
                break;
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");
        System.out.println();

        // * case 2, 3 통합
        ranking = 3;
        switch ( ranking ) {
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;
            default :
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

    }
}
