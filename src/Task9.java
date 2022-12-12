import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int len = in.nextInt();
        double[] arrayForTest = new double[len];
        System.out.println("Введите числа:");
        // записываем введённые пользователем числа в массив
        for (int i = 0; i <= len - 1; i++) {
            double a = in.nextDouble();
            arrayForTest[i] = a;
        }
        // вычисляем среднее
        double average = 0;
        double sum = 0;
        for (int j = 0; j < arrayForTest.length; j++) {
            sum += arrayForTest[j];
        }
        average = sum / arrayForTest.length;
        // домножаем числа массива на среднее арифметическое и выводим массив
        for (int j = 0; j < arrayForTest.length; j++) {
            arrayForTest[j]=arrayForTest[j]*average;
        }
        System.out.println(Arrays.toString(arrayForTest));
    }
}
