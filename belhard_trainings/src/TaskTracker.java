import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) {
        System.out.println("Привет, я таск-трекер!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название задачи:");
        String taskName = scanner.nextLine();
        System.out.print("Введите описание задачи:");
        String description = scanner.nextLine();
        System.out.print("Введите приоритет задачи:");
        int priority = scanner.nextInt();
        System.out.println("Информация о задаче:");
        System.out.printf("Название задачи - %s;\n", taskName);
        System.out.printf("Описание задачи - %s;\n", description);
        System.out.printf("Приоритет задачи - %s;\n", priority);
    }
}