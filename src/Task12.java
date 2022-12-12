import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите: I like Java!!!");
        String example = in.nextLine();
        boolean result1 = example.contains("Java");
        boolean result2 = example.startsWith("I like");
        boolean result3 = example.endsWith("!!!");
        if (result1 == true && result2 == true && result3 == true){
            System.out.println(example.toUpperCase());
        }
        String newExample = example.replace('a','o');
        System.out.println(newExample.substring(7,11));
    }
}
