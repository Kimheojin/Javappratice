import java.util.Scanner;

public class ch3 {

    public static void main(String[] args) {

        ch3 instance = new ch3();
        instance.start_1();
        instance.start_2();
        instance.start_3();
        instance.start_4();
        instance.start_5();

    }

    public void start_1() {
        int i = 5;
        i++;
        System.out.print(i);

        i = 5;
        ++i;
        System.out.println(i);

    }

    public void start_2() {

        String str1 = "abc";
        String str2 = new String("abc");

        System.out.print(str1.equals(str2));

    }

//    문자열을 비교할 때에는 equals를 사용해야 한다/*
//    좀 중요한듯
//    조건연산
//    삼항연산자
//    참이면 앞에거 반환 false면 뒤에거 반환
//    */

    public void start_3() {
//        조건이 참이면 앞에거 반환
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;
        absX = x >= 0 ? x : -x;
        System.out.println(absX);

    }

    /*
     * 대입 연산자
     * 조건문 if, switch문
     * */
    public void start_4() {

        /*
        * 조건식
        * if문은 조건시 참인 경우에만 실행
        * */

        int score = 60;

        if (score > 30) System.out.println("합격입니다");

    }

    public void start_5() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 0 입니다");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다");
        }
    }

    public void start_6() {
        /*
        * switch문은 break문 꼭 써주기
           for문
           * 향상된 for문
           * 타입 변수면 : 변수 또는 배열
        * */

    }
}
