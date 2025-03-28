// 사용자로부터 이름과 나이를 각각 선언한 후 출력하는 프로그램 개발하시오.
// 사용자로부터 이름(XXX)과 나이(YY)는 각각 선언한다.
// 출력은 XXX님은 00살입니다.라고 출력한다.

// import java.util.Scanner;

// public public static void main(String[] args) {
//    String name;
//    int age;

//    Scanner sc = new Scanner(System.in);
//    System.out.println("input Ur name: ");
//    username = sc.next();
//    System.out.println("input Ur age: ");
//    userage = sc.next();

//    System.out.println("user name is"+name+"user age is"+userage);
//    System.out.println(intro);
// }


//public class java4week {
    //public static void main(String[] args) {
        // 1. 이름 선언 - String name = "이름"
        // 2. 나이 선언 - int age = "나이"
        // 3. 이름 및 나이 출력 - System.out.println
        // Class Main - java keyword엔 대문자를 사용하지 않음. 대문자 == class
        // ex. Main == Class, main == 메소드
        // 상수 - 대문자, 변수 - 소문자, CLass - 첫글자 대문자
         //String name = "조현지";
         //int age = 21;
         //System.out.println("name is "+name+",age is "+age);

        // 반지름이 10.0인 원의 면적을 계산하는 프로그램을 작성해보자.
        // 모든 #변수 를 #실수형 으로 정의한다.
        // 파이는 #상수 PI로 정의한다.
        // 반지름이 10인 원의 면적은 314이다.
        // double 말고 float 사용할 경우 float 함수명 = 00.00f
        //double radius = 10.0;
        //final double PI = 314;
        //double result_area = radius * radius * PI;
        //System.out.println("result_area is "+result_area);
    //}
//}


public class java4week {
    public static void main(String[] args) {
        // 주어진 값들
        double doubleValue = 2.71828;

        // double에서 다른 타입으로의 형변환 결과 출력
        System.out.println("\n=== double 형변환 ===");
        System.out.println("1. double -> byte: " + (byte)doubleValue);
        System.out.println("2. double -> short: " + (short)doubleValue);
        System.out.println("3. double -> int: " + (int)doubleValue);
        System.out.println("4. double -> long: " + (long)doubleValue);
        System.out.println("5. double -> float: " + (float)doubleValue);
    }
}