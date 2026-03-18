import java.util.Scanner;

public class Tracker {
    public static void main(String[] args) {
        System.out.println("Привет, я таск-трекер!");
        Scanner scanner = new Scanner(System.in);

        final int MAX_TASKS = 100;
        String[][] tasks = new String[MAX_TASKS][3];
        int taskCount = 0;

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1 - Ввести задачу");
            System.out.println("2 - Вывести информацию о задачах");
            System.out.println("0 - Выход");
            System.out.print("Выберите пункт меню: ");

            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("Выход из программы. Пока!");
                break;
            } else if (input.equals("1")) {
                if (taskCount >= MAX_TASKS) {
                    System.out.println("Достигнуто максимальное количество задач. Нельзя добавить новую.");
                    continue;
                }

                System.out.print("Введите название задачи: ");
                String taskName = scanner.nextLine();

                System.out.print("Введите описание задачи: ");
                String description = scanner.nextLine();

                int priority = -1;
                while (priority < 0) {
                    System.out.print("Введите приоритет задачи (целое число >= 0): ");
                    String prInput = scanner.nextLine();
                    try {
                        priority = Integer.parseInt(prInput);
                        if (priority < 0) {
                            System.out.println("Приоритет должен быть неотрицательным числом.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка! Введите корректное целое число.");
                    }
                }

                tasks[taskCount][0] = taskName;
                tasks[taskCount][1] = description;
                tasks[taskCount][2] = String.valueOf(priority);
                taskCount++;

                System.out.println("Задача успешно добавлена.");

            } else if (input.equals("2")) {
                if (taskCount == 0) {
                    System.out.println("Список задач пуст.");
                } else {
                    System.out.println("Список задач:");
                    for (int i = 0; i < taskCount; i++) {
                        System.out.printf("%d) Название: %s; Описание: %s; Приоритет: %s%n",
                                i + 1, tasks[i][0], tasks[i][1], tasks[i][2]);
                    }
                }
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, выберите пункт из меню.");
            }
        }
        scanner.close();
    }
}