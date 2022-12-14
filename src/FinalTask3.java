import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = in.nextInt();
        int[] arrayForWordSize = new int[n];
        int max = arrayForWordSize[0];
        System.out.println("Введите текст строки: ");
        String[] array = new String[n];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            array[i] = in.next();
//            System.out.printf("Строка"); потом принтануть строку
        }
        for (String s : array) {
            Set<Character> wordSet = new HashSet<>();
            for (Character c : s.toCharArray()) {
                wordSet.add(c);
            }
            arrayForWordSize[Arrays.asList(array).indexOf(s)] = wordSet.size();
        }
        int indexForMax=0;
        for (int i = 1; i < arrayForWordSize.length; i++) {
            if (arrayForWordSize[i] > max) {
                max = arrayForWordSize[i];
                indexForMax=i;
            }
        }
        System.out.println(array[indexForMax]);
    }
}
