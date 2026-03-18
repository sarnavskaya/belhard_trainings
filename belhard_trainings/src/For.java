import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        do {
            System.out.print("Введите число больше 0: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число! Попробуйте ещё раз.");
                scanner.next();
            }
            x = scanner.nextInt();
            if (x <= 0) {
                System.out.println("Число должно быть больше 0. Попробуйте ещё раз.");
            }
        } while (x <= 0);

        int sum = 0;
        for (int i = 0; i <= x; i++) {
            sum += i;
        }

        System.out.printf("Сумма всех чисел от 0 до %d равна %d.%n", x, sum);
    }
}