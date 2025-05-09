import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        String grade = "";

        System.out.println("Enter your score: ");
        score = sc.nextInt();

        switch (score/10) {
            case 9:
                grade = "A";
                System.out.println("your score is "+score+", your grade is "+grade);
                break;
            case 8:
                grade = "B";
                System.out.println("your score is "+score+", your grade is "+grade);
                break;
            case 7:
                grade = "C";
                System.out.println("your score is "+score+", your grade is "+grade);
                break;
            case 6:
                grade = "D";
                System.out.println("your score is "+score+", your grade is "+grade);
                break;
            case 5:
                grade = "F";
                System.out.println("your score is "+score+", your grade is "+grade);
                break;
            default:
                System.out.println("Invalid score");
                System.exit(0);
        }
    }
}