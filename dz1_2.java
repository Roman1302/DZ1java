// Вывести все простые числа от 1 до 1000

public class dz1_2 {
    public static void main(String[] args) {
        // Первые простые числа это — 2,3,5,7

        System.out.print("2, 3, ");
        boolean flag;
        for (int i = 5; i <= 1000; i++) {
            flag = true;
            for (int j = 2; j < i / 2; j++) {
                if ((i % j) == 0) {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.print(i + ", ");
            }
        }
    }
}