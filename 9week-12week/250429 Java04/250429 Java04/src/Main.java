import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("숫자를 입력하세요.");
        num = sc.nextInt();

        if ( num >= 1 && num <= 100 ) {
            System.out.println("1~100 사이의 숫자입니다.");
        }
        else {
            System.out.println("1~100 사이의 숫자가 아닙니다.");
        }
    }
}