// 1. 점수 입력
// 2. 누적
// 3. 음수 >> 종료 + 누적 값 출력
// 출력 요구사항 - 2 무시

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int choice = 0;
        int score = 0;
        int cumulative = 0;

        while (true) {
            System.out.println("Enter the number of score: ");
            score = sc.nextInt();

            if (score >= 0) {
                System.out.println("Your score is: " + score);
                cumulative = cumulative + score;
                score = 0;
            } else if (score < 0) {
                System.out.println("Cumulative score is: " + cumulative);
                System.out.println("Program exit...");
                //System.exit(0);
                break;
            } else {
                System.out.println("Invalid score entered.");
            }
        }

    }
}