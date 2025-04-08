//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int kor = 0, eng = 0, mat = 0, sci = 0 ;

        int sum = 0, intAvg = 0 ;
        double doubleAvg = 0.0 ;
        boolean boolRsit = false ;

        System.out.println("Enter the number of korean score: ");
        kor = sc.nextInt() ;
        System.out.println("Enter the number of english score: ");
        eng = sc.nextInt() ;
        System.out.println("Enter the number of mat score: ");
        mat = sc.nextInt() ;
        System.out.println("Enter the number of science score: ");
        sci = sc.nextInt() ;

        sum = kor + eng + mat + sci ;
        intAvg = sum / 4 ;
        doubleAvg = sum / 4.0 ;
        boolRsit = intAvg == doubleAvg ;

        System.out.println("The average score1 is: "+intAvg) ;
        System.out.println("The average score2 is: "+doubleAvg) ;
        System.out.println("The sore result is: "+boolRsit) ;
        }
    }
