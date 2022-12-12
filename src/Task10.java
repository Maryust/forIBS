import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        System.out.println("Количество строк:");
        int strings = in.nextInt();
        System.out.println("Количество столбцов:");
        int columns = in.nextInt();
        int [][] array = new int[strings][columns];
        // заполняем матрицу значениями
        System.out.println("заполните матрицу числами:");
        for (int i=0; i<strings; i++){
            for (int j=0; j<columns; j++){
                array[i][j] = in.nextInt();
            }
        }
        // домножаем значения первой строки на 3
        for (int j=0; j<columns; j++){
            array[0][j]=array[0][j]*3;
        }
        System.out.println(Arrays.toString(array[0]));
    }
}
