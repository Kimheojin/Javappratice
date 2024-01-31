import java.util.Scanner;

public class ch2 {

    public static void main(String[] args ) {

//      변수 타입이 공간 생성
        ch2 instance = new ch2();

        instance.start_1();
        instance.start_2();
        instance.start_4();


    }

    public void start_1() {

        int year = 0;
        int age = 14;

        System.out.println(year);
        System.out.println(age);

    }

    public void start_2() {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y :" + y);


    }/*
    변수의 명명 규칙(식별자)

    대소문자가 구분되며 길이에 제한이 없다
    예약어를 사용해서는 안된다.
    숫자로 시작해서는 안된다
    특수문자는 _와

    클래스 이름의 첫 글자는 항상 대문자로 한다
    여러 단어로 이루어지ㄴ 이름은 단어의 첫 글자를 대문자로 한다
    상수의 이름은 모두 대문자로 한다

    */
    /*
    * 기본형과 참조형
    * 정수와 실수
    * 기본형 변수는 실제 값(data)를 저장하는 반면, 참조형 변수는 저
    * 저장되어 있는 주소를 가지게 된다
    * 클래스 이름 변수이름
    * */

    public void start_3() {

        float pi = 3.14f;
        //접미사 꼭 붙여주기
        float rate = 1.618f;
        //doublie형은 생략해 주어도 상관 X
        //탕ㅂ의 불일치
        /* 에러나는 범위 생각하기*/

        System.out.printf("%f %f", pi, rate);

        /*
        * printf println 차이
        *
        *%d %f 사용하기 위해 printf 를 사용한다
        *println은 사용 불가
        * */

    }

    public void start_4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("두자리 정수를 입력해 주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d%n", num);

    }

    public void start_5() {
        /*
        * word 1 비트는 컴퓨터가 값을 저장할 수 있는 최소단위이다
        * 10진법과 2진법*/
        int age = 25;

    }

    public void start_6() {
//       연산자 결합규칙

    }


}
