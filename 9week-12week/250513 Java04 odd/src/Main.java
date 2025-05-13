//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int maxNum = 0;
            int sum = 0;

            while (true) {
            System.out.println("Enter the number: ");
            maxNum = sc.nextInt();
            if (maxNum > 0) {
                break; }
            else if (maxNum <= 0) {
                System.out.println("Number is negative");
                }
            else {
                System.exit(0); }
            }

            for (int i = 1; i <= maxNum; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }

            System.out.println("1~"+maxNum+" odd sum: "+sum);
        }
    }