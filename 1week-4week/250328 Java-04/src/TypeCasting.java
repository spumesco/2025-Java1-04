//public class Typecasting {
    //public static void typecasting(String[] args) {
        //double double_V = 2.71828 ;

        //byte byte_V = (byte)double_V;
        //short short_V = (short)double_V;
        //int int_V = (int)double_V;
        //long long_V = (long)double_V;
        //float float_V = (float)double_V;

        //System.out.println("\n=== double_V 형태 변환===");
        //System.out.println("1. double >> byte: " + byte_V);
        //System.out.println("2. double >> short: " + short_V);
        //System.out.println("3. double >> int: " + int_V);
        //System.out.println("4. double >> long: " + long_V);
        //System.out.println("5. double >> float: " + float_V);
    //}
//}



//int num = 100; long bigNum = num; int-long, float-double

        // 학생의 시험 점수들 (정수형) - 소수점 결과가 나오도록 수정
        //int korean = 85;
        //int english = 92;
        //int math = 76;
        //int totalSubjects = 3;

        // 방법 1: 형변환 없이 평균 계산 (정수 나눗셈)
        //int sum = korean + english + math;
        //int averageWithoutCasting = sum / totalSubjects;
        //System.out.println("형변환 없는 평균: " + averageWithoutCasting);

        // 방법 2: 형변환을 사용한 평균 계산 (실수 나눗셈)
        //double averageWithCasting = (double) sum / totalSubjects;
        //System.out.println("형변환 사용 평균: " + averageWithCasting);

        // 소수점 두 자리로 반올림하여 표시
        //System.out.printf("형변환 사용 평균(반올림): %.2f\n", averageWithCasting);


public class TypeCasting {
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