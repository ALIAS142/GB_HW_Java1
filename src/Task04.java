
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

        Scanner iScanner = new Scanner(System.in);

        System.out.println("The equation is given: ");
        String equation = iScanner.nextLine();
        String message = "No solution";
        boolean flag = true;

        for (int i = 0; (i < 10) && flag; i++) {
            String result = equation.replace("?", Integer.toString(i));
            System.out.println(result);

            String [] arr = result.split(" ");

            if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){
                message = result;
                flag = false;
            }
        }
        System.out.println(message);
        iScanner.close();

    }
    }



