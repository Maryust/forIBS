import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        float course = in.nextFloat();
        System.out.println("Введите количество рублей: ");
        float amount = in.nextFloat();
        float result = amount/course;
        System.out.printf("Итого: %.2f", result);
    }
}
