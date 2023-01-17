package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {

    // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
    // \n, \t, \\, \", \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        System.out.println();

        // 1. \n : 줄바꿈
        System.out.println("자바가\n너무\n재밋어요");
        System.out.println();
        /*
           2. \t : tab기능(4줄 띄우기)
            해물파전    9000원
            김치전     8000원
            부추전     8000원
         */
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        System.out.println();

        // 3. \\ : 역슬래시 표현
        System.out.println("C:\\Program Files\\java");
        System.out.println();

        /*
            4. \" : 문자열 안에서 큰따옴표(") 표시
            단비가 "냐옹" 이라고 했어요
         */
        System.out.println("단비가 \"냐옹\" 이라고 했어요");
        System.out.println();

        // 5. \' : 문자열 안에서 작은따옴표(') 표시
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println();

        char c = 'A';
//        c = '''; // 문자형에서 작은 따옴표 표시 시 역슬래시가 필요하다.
        c = '\'';
        System.out.println(c);

    }
}
