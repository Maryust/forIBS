import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] arrayForTest = new int[15];
        int max = arrayForTest[0];
        int min = arrayForTest[0];
        // int x = (int)(Math.random()*((max-min)+1))+min - указываем диапазон для функции рандом
        for (int i = 0; i < 15; i++) {
            arrayForTest[i] = (int) (Math.random() * 41 - 20);
        }
        // если нужно вывести полученный массив
        //System.out.println(Arrays.toString(arrayForTest));
        // определяем максимальный элемент
        for (int i = 1; i < arrayForTest.length; i++) {
            if (arrayForTest[i] > max) {
                max = arrayForTest[i];
            }
        }
        System.out.println(max);
        // определяем минимальный элемент
        for (int i = 1; i < arrayForTest.length; i++) {
            if (arrayForTest[i] < min) {
                min = arrayForTest[i];
            }
        }
        System.out.println(min);
        // сравниваем максимальный и минимальный элемент
        int result = Math.max(Math.abs(max), Math.abs(min));
        System.out.println(result);
    }
}
