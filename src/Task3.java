import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayForTest = new int[]{1, 2, 3, 4, 5};
        //меняем местами первый и последний элемент
        int temp = arrayForTest[0];
        arrayForTest[0] = arrayForTest[arrayForTest.length - 1];
        arrayForTest[arrayForTest.length - 1] = temp;
        int a = arrayForTest.length - 1;
        //определяем индекс среднего элемента
        int b = a / 2 + a % 2;
        //вычисляем сумму первого и среднего элемента
        int sum = arrayForTest[0] + arrayForTest[b];
        System.out.println(sum);
    }
}
