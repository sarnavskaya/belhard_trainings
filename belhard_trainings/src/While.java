import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input="";

        while (true) {
            System.out.println("Введите что-нибудь (или 'exit' для выхода):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            if (input.isEmpty()) {
                System.out.println("Вы ничего не ввели, попробуйте ещё раз.");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        }
        scanner.close();
    }
}