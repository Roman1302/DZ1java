
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class dz1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер треугольника");
        int r = input.nextInt();
        nNumberSum(r);
        nNumberMult(r);

    }

    public static void nNumberSum(int n) {
        List<Integer> integers = new ArrayList<>();
        System.out.println("\nТреугольник суммы чисел");
        for (int i = 2; i <= n + 1; i++) {
            int t = i - 1;
            integers.add(t);
            for (int value : integers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void nNumberMult(int n) {
        List<Integer> integers = new ArrayList<>();
        System.out.println("\nТреугольник произведения чисел");
        for (int i = 1; i <= n; i++) {
            int t = i * i;
            integers.add(t);
            for (int value : integers) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}