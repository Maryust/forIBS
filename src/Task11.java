import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String firstNumber = in.next();
        int i = Integer.parseInt(firstNumber);
        System.out.println("Введите второе число:");
        int secondNumber = in.nextInt();
        // выводим большее число на экран
        int maximum = Math.max(i,secondNumber);
        System.out.println(maximum);
        // выводим меньшее число на экран
        double minimum = Math.min(i,secondNumber);
        System.out.println(minimum);
    }
}
