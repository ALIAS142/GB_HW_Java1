
import java.util.Scanner;

//4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
//        Требуется восстановить выражение до верного равенства.
//        Предложить хотя бы одно решение или сообщить, что его нет.
//        Под знаком вопроса - всегда одинаковая ЦИФРА.
//        Введите уравнение: ?? + ?? = 44
//        Решение: 22 + 22 = 44

public class Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("The equation is given: ?? + ?? = 44");



        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (20 + i + 20 + j == 44) {
                    count += 1;
                    System.out.println(count + ") 2" + i + " + " + "2" + j  + " = 44");
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("No solution\n");
        }

    }
    }



