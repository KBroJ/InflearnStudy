package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
    /*
        (실행 결과)
        상암08번 버스
        약 3분 후 도착
        남은 거리 1.2km
     */
        String busNumber = "상암08"; // 버스 번호
        int eta = 3; // 버스 도착시간(분단위) : Estimated Time of Arrival
        double eda = 1.2; // 버스 남은거리(km단위) : Estimated Distance of Arrival

        System.out.println(busNumber + "번 버스");
        System.out.println("약 " + eta + "분 후 도착");
        System.out.println("남은 거리 " + eda + "km");

    }
}
