import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любой текст на киррилице и латинице, слова должны быть разделены пробелами: ");
        String example = in.nextLine();
        // отбрасываем русские символы и числа с помощью регулярки
        String resultEnglishOnly = example.replaceAll("[^a-zA-Z\\s]", "");
        System.out.println(resultEnglishOnly);
        // разделяем строку на массив строк по пробелам
        String[] result = resultEnglishOnly.split(" ");
        // количество слов = количеству элементов массива
        System.out.println(result.length);

    }
}
