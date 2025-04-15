import java.util.Scanner ;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("input the score: ") ;
        int score = scanner.nextInt() ;
        String grade ;

        if (score >= 90) {
            grade = "A" ;
        } else if (score >= 80) {
            grade = "B" ;
        } else if (score >= 70) {
            grade = "C" ;
        } else if (score >= 60) {
            grade = "D" ;
        } else if (score >= 50) {
            grade = "E" ;
        } else {
            grade = "F" ;
        }

        System.out.println("achievement: "+grade) ;
        scanner.close() ;
    }
}