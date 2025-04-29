import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choiceCoffee = 5;
        String Coffee = "";
        int choiceSize = 5;
        String Size = "";
        int choiceOption = 5;
        String Option = "";
        int price = 0;

        System.out.println("Choose coffee");
        choiceCoffee = sc.nextInt();
        switch (choiceCoffee) {
            case 1:
                Coffee = "americano";
                price = 8000;
                break;
            case 2:
                Coffee = "cafe latte";
                price = 7000;
                break;
            case 3:
                Coffee = "cappuccino";
                price = 9000;
                break;
            default:
                System.out.println("Choice number invalid");
                System.exit(0);
        }

        System.out.println("Choose size");
        choiceSize = sc.nextInt();
        switch (choiceSize) {
            case 1:
                Size = "small";
                price = price + 0;
                break;
            case 2:
                Size = "medium";
                price = price + 500;
                break;
            case 3:
                Size = "large";
                price = price + 1000;
                break;
            default:
                System.out.println("Choice number invalid");
                System.exit(0);
        }

        System.out.println("Choose option");
        choiceOption = sc.nextInt();
        switch (choiceOption) {
            case 1:
                Option = "original";
                price = price + 0;
                break;
            case 2:
                Option = "more shot";
                price = price + 500;
                break;
            case 3:
                Option = "more syrup";
                price = price + 300;
                break;
            case 4:
                Option = "more shot and more syrup";
                price = price + 800;
                break;
            default:
                System.out.println("Choice number invalid");
                System.exit(0);
        }

        System.out.println("your choice coffee is "+Coffee+", and coffee size is "+Size+", and pluse option is "+Option+", and pluse price is "+price);
    }
}