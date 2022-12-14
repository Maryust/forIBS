import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        int n = 3;
        boolean help = false;
        while (n > 0){
            String answer = sc.nextLine();
            switch (answer){
                case "Заархивированный вирус":
                    System.out.println("Правильно!");
                    n = 0;
                    break;
                case "Подсказка":
                    if (n == 3){
                        help = true;
                        System.out.println("Какой-то овощ");
                        break;
                    } else {
                        System.out.println("Подсказка уже недоступна!");
                    };
                default:
                    if (n==3 || n==2 && help == false){
                        System.out.println("Подумай еще!");
                    } else if (help==true){
                        System.out.println("Обидно, приходи в другой раз");
                        n = 0;
                        break;
                    } else if (n==1){
                        System.out.println("Обидно, приходи в другой раз");
                        break;
                    }
            }
            n--;
        }
    }
}
