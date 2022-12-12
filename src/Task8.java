import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        // пользователь не сможет ввести не целое число так как формат int
        int n = in.nextInt();
        // создаём массив из нечётных чисел до числа n
        if (n > 0) {
            List<Integer> myArray = new ArrayList<Integer>();
            for (int i = 1; i <= n; i += 2) {
                myArray.add(i);
            }
            int sum = 0;
            for (int i = 0; i < myArray.size(); i++) {
                sum = sum + myArray.get(i);
            }
            System.out.println(sum);
        }
        // если пользователь ввёл отрицательное число
        System.out.println("Вы ввели отрицательное число");
    }
}
