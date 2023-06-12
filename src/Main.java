import java.util.Arrays;
import java.util.stream.IntStream;

//Таблица умножения
public class Main {

    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d", j * i);
                System.out.println("\n");

            }

        }
    }
}

//Задать массив:
//import java.util.Arrays;
//        import java.util.stream.IntStream;
//
//public class Task04 {
//
//    public static void main(String[] args){
//        int n = 99;
//
//        int[] arr = IntStream.rangeClosed(10, n).toArray();
//        System.out.println(Arrays.toString(arr));
//    }