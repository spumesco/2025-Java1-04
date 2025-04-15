//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Starting program...");
        Scanner sc = new Scanner(System.in) ;
        String todo = "Y", worknow = "Y", endnow = "Y" ;
        int type = 0 ;


        System.out.println("Do you have assignment?(Y/n): ");
        todo = sc.nextLine();
        if (todo == "Y") {
            System.out.println("What type is your assignment(1. Major, 2. Liberal arts: ");
            type = sc.nextInt();

            while (type != 1 || type != 2) { System.out.println("What type is your assignment(1. Major, 2. Liberal arts: "); }

            System.out.println("Do you start to "+type+" now?(Y/n): ");
            worknow = sc.nextLine();

            if (worknow == "Y") {
                System.out.println("Starting "+type+" now...");

                while (endnow != "Y") {
                    System.out.println("Do you end to"+type+"now?(Y/n): ");
                    endnow = sc.nextLine();
                    System.out.println("Continue with the "+type+" now...");
                }

                System.out.println("Thanks for your using...");
                System.out.println("End the program...");
            }


            else if (worknow == "N") { System.out.println("Close the Program...");
            }
            else { System.out.println("End the program...");
            }
        }

        else if (todo == "N") {
            System.out.println("Thanks for your using...");
            System.out.println("End the program...");
        }
        else { System.out.println("End the program...");
        }
    }
}

// 안녕하세요 교수님!! 프로그램 코드는 작성하였으나 작동되지 않으며, 해당 코드의 문제점을 찾을 수 없어 결과 이미지를 함께 첨부합니다.
// 남아서 나름 열심히 해 보았는데 잘 안 되었네요...ㅜㅜ