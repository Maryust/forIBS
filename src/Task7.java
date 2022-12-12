import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 15;
        final int z = 17;
        // записываем константы в массив, для удобства итерации по константам
        int[] xyz = new int[]{x, y, z};
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        int[] arrayForTest = new int[len];
        System.out.println("Введите числа:");
        // записываем введённые пользователем числа в массив
        for (int i = 0; i <= len - 1; i++) {
            int a = in.nextInt();
            arrayForTest[i] = a;
        }
        // определяем есть ли в массиве пользователя константы
        for (int digit : xyz) {
            for (int s : arrayForTest) {
                if (digit == s) {
                    System.out.println("Данное значение имеется в константах");
                    break;
                }
            }
        }
    }
}
