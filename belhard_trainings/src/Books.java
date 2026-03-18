import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Наш курс называется \"Java для автоматизаторов\", Как тебя зовут?");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName);
        System.out.print("Введи размер массива от 0 до 100: ");
        int arraySize = scanner.nextInt();
        scanner.nextLine();
        if (arraySize >= 0 && arraySize <= 100) {
        } else {
            System.out.print("Вы вышли за возможный диапазон массива. Введи новый размер массива: ");
            arraySize = scanner.nextInt();
            scanner.nextLine();
        }
        String[] favoriteBooks = new String[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите любимую книгу №" + (i + 1) + ":");
            favoriteBooks[i] = scanner.nextLine();
        }
        System.out.println("Твои любимые книги:");
        for (int i = 0; i < arraySize; i++) {
            System.out.println((i + 1) + ". " + favoriteBooks[i]);
        }
    }
}
