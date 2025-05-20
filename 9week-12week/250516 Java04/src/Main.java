import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for(int i = 0; i < 10; i++) {
            //if (i == 5)
                //continue;
            //if(i == 8)
                //break;
            //System.out.println(i);
        //}

        // 1. 1~10번 반복
        // 2. 0~100 사이 입력 받음 >> 루프 종료
        // 3. 조건에 맞지 않으면 다시 입력 받을 것. (최대 10회)
        // 4. 입력 받은 숫자 출력
        int inputNUM = 0;

        for (int i = 0; i < 10;) {
            System.out.print("Input the score(number 0~100): ");
            inputNUM = sc.nextInt();

            if (0 <= inputNUM && inputNUM <= 100) {
                System.out.println("The score is: "+inputNUM);
                break; }

            System.out.println("Invaild number: "+inputNUM);
            i++;
        }

    }
}