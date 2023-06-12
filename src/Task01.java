//1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;
public class Task01 {
//    public static void main(String[] args) {
//        int result = TrungleN(5);
//        System.out.println(result);
//    }
////1 вариант(треугольное число):
//
//    public static int TrungleN(int n) {
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + TrungleN(n - 1);
//        }
//    }
//}

    //2 вариант:

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter number N:  ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 0; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
//}


    //n!
    public static void main(String[] args) {
        int result = factNumber(5);
        System.out.println(result);
    }
    public static int factNumber(int n2) {
        if (n2 < 1) {
            return 1;
        } else {
            return n2 * factNumber(n2 - 1);
        }
    }
}