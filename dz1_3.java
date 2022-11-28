// калькулятор

import java.util.Scanner;

public class dz1_3 {
    public static void main(String[] args) {
        System.out.print("Введите первое число для операции: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.print("Введите тип операции( + ; - ; * ; / ; %): ");
        char symbol = in.next().charAt(0);
        System.out.print("Введите второе число для операции: ");
        // Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        calculator(a, b, symbol);
        in.close();
    }

    public static int calculator(int a, int b, char symbol) {
        int result = 0;
        if (symbol == '+') {
            result = a + b;

        } else if (symbol == '-') {
            result = a - b;

        } else if (symbol == '*') {
            result = a * b;
        } else if (symbol == '%') {
            result = a % b;

        } else if (symbol == '/') {
            result = a / b;
        }

        System.out.println("Ответ: " + result);
        return result;
    }
}