import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String row = sc.nextLine();
        int index = row.indexOf("=");
        if (row.length() > 5) {
            System.out.println("Длина строки больше, чем 5 символов.");
            System.exit(0);
        } else if (index != 3) {
            System.out.println("Некорректное выражение");
            System.exit(0);
        }
        char[] arr = new char[row.length()];
        for (int i = 0; i < row.length(); i++) {
            arr[i] = row.charAt(i);
        }
        if (arr[1] == '+') {
            if (arr[0] == 'x') {
                result = Character.getNumericValue(arr[4]) - Character.getNumericValue(arr[2]);
            } else if (arr[2] == 'x') {
                result = Character.getNumericValue(arr[4]) - Character.getNumericValue(arr[0]);
            } else if (arr[4] == 'x') {
                result = Character.getNumericValue(arr[0]) + Character.getNumericValue(arr[2]);
            }
        } else if (arr[1] == '-') {
            if (arr[0] == 'x') {
                result = Character.getNumericValue(arr[4]) + Character.getNumericValue(arr[2]);
            } else if (arr[2] == 'x') {
                result = 0 - (Character.getNumericValue(arr[4]) - Character.getNumericValue(arr[0]));
            } else if (arr[4] == 'x') {
                result = Character.getNumericValue(arr[0]) - Character.getNumericValue(arr[2]);
            }
        } else {
            System.out.println("Некорректное выражение");
        }
        System.out.println(result);
    }
}