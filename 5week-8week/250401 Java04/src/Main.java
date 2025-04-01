import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3 = 0;
        char op;

        System.out.printf("input the number1: ");
        num1 = sc.nextInt();
        System.out.printf("input the number2: ");
        num2 = sc.nextInt();
        System.out.printf("input the operator: ");
        op = sc.next().charAt(num3);

        if (op == '+') { num3 = num1 + num2;
            System.out.println(num1+"+"+num2+"="+num3); }
        else if (op == '-') { num3 = num1 - num2;
            System.out.println(num1+"-"+num2+"="+num3); }
        else if (op == '*') { num3 = num1 * num2;
            System.out.println(num1+"×"+num2+"="+num3); }
        else if (op == '/') { num3 = num1 / num2;
            System.out.println(num1+"÷"+num2+"="+num3);}
        else {
            System.out.printf("input the operator: ");
            op = sc.next().charAt(num3);
        }
    }
}
