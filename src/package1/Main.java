package package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int number = (int) (Math.random() * a);

        System.out.println("Тебе необходимо угадать число!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число от 0 до " + a + ":");

        while (true) {

            try {
                int guessNumber = Integer.parseInt(scanner.nextLine());

                if (guessNumber == number) {
                    System.out.println("Ты угадал, поздравляю:)");
                    break;
                } else if (guessNumber > number)
                    System.out.println("Загаданное число меньше...");
                else if (guessNumber < number)
                    System.out.println("Загаданное число больше...");

            } catch (NumberFormatException e) {
                System.out.println("Ты ввел некорректное значение:(");
            }
        }

        scanner.close();
    }
}
