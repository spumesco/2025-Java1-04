import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentNum = 0;
        int subjectNum = 0;

        System.out.print("Enter the number of students: ");
        studentNum = sc.nextInt();
        System.out.print("Enter the number of subjects: ");
        subjectNum = sc.nextInt();

        //int studentScore[studentNum][subjectNum];
        int[][] studentScore = new int[studentNum][subjectNum];

        for (int i = 0; i < studentNum; i++) { //점수 입력
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectNum; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                studentScore[i][j] = sc.nextInt();
            }
        }

        System.out.println("성적표");
        for (int i = 0; i < studentNum; i++) { //점수 출력
            System.out.println("\n[" + (i + 1) + "번 학생]");
            for (int j = 0; j < subjectNum; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                System.out.println(studentScore[i][j]);
            }
        }

        //for (int i = 0; i < studentNum; i++) { //점수 출력
            //int[] inArr = studentScore[i]; //생략
        //}   for (int j = 0; j < subjectNum; j++) {
                //System.out.print(studentScore[j] + " ");
        //}
        //System.out.println();
    }
}