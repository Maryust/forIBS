import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        float tonna=0;
        float kg=0;
        double meter=0;
        double mile=0;
        double yard=0;
        double foot=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Выберете что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("Выберете единицу измерения: 1 - тонна, 2 - килограмм");
            int z = in.nextInt();
            if (z !=1 && z!=2){
                System.out.println("Вы ввели не верное значение");
                System.exit(0);
            }
            else {
                System.out.println("Введите число: ");
                float symbol = in.nextFloat();
                System.out.println("Результат: ");
                switch (z) {
                    case 1:
                        tonna = symbol;
                        kg = symbol * 1000;
                        System.out.printf("Тонны: %.2f\nКилограммы: %.2f", tonna, kg);
                        break;
                    case 2:
                        tonna = symbol / 1000;
                        kg = symbol;
                        System.out.printf("Тонны: %.5f\nКилограммы: %.2f", tonna, kg);
                        break;
                }
            }
        }
        else if (x == 2){
            System.out.println("Выберете единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int y = in.nextInt();
            if (y !=1 && y!=2){
                System.out.println("Вы ввели не верное значение");
                System.exit(0);
            }
            else {
                System.out.println("Введите число: ");
                float symbol = in.nextFloat();
                System.out.println("Результат: ");
                switch (y) {
                    case 1:
                        meter = symbol;
                        mile = symbol * 0.00062;
                        yard = symbol * 1.09;
                        foot = symbol * 3.28;
                        System.out.printf("Метры: %f\nМили: %f\nЯрды: %f\nФуты: %f", meter, mile, yard, foot);
                        break;
                    case 2:
                        meter = symbol * 1609.34;
                        mile = symbol;
                        yard = symbol * 1760;
                        foot = symbol * 5280;
                        System.out.printf("Метры: %f\nМили: %f\nЯрды: %f\nФуты: %f", meter, mile, yard, foot);
                        break;
                    case 3:
                        meter = symbol * 0.91;
                        mile = symbol * 0.0057;
                        yard = symbol;
                        foot = symbol * 3;
                        System.out.printf("Метры: %f\nМили: %f\nЯрды: %f\nФуты: %f", meter, mile, yard, foot);
                        break;
                    case 4:
                        meter = symbol * 0.3;
                        mile = symbol * 0.0019;
                        yard = symbol * 0.33;
                        foot = symbol;
                        System.out.printf("Метры: %f\nМили: %f\nЯрды: %f\nФуты: %f", meter, mile, yard, foot);
                        break;
                }
            }
        }
        else {
            System.out.println("Вы ввели не верное значение");
        }
    }
}
