import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введи x: ");
        int x = in.nextInt();
        System.out.println("введи y: ");
        int y = in.nextInt();
        System.out.println("введи z: ");
        int z = in.nextInt();
        int[] arrayForTest = new int[]{x, y, z};
        double average = 0;
        double sum = 0;
        for (int j = 0; j < arrayForTest.length; j++) {
            sum += arrayForTest[j];
        }
        average = sum / arrayForTest.length;
//        int number = (int) (average / 2);
        if ((int)(average / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
