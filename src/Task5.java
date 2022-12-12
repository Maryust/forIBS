import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введи первое число: ");
        int x = in.nextInt();
        System.out.println("введи второе число: ");
        int y = in.nextInt();
        System.out.println("введи один из символов +, -, *, / : ");
        String symbol = in.next();
        int result = 0;
        String error = null;
        switch (symbol) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            default:
                error = "Вы ввели неверный символ";
        }
        if (error != null) {
            System.out.println(error);
        } else System.out.println(result);
    }
}
