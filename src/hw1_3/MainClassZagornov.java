package hw1_3;
import java.util.Random;
import java.util.Scanner;

public class MainClassZagornov {
    private static Scanner in;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Привет, мой юный друг... Я хочу сыграть с тобой в одну игру...");
        int num = 10;
        int count = 0;
        int number = (int) (Math.random() * num);
        for (int i = 3; i > 0; i--) {
            System.out.println("Нужно угадать число от 0 до 10.\nПроверим тебя на прочность...");
            int answer = sc.nextInt();
            if (answer == number) {
                System.out.println("Вы выиграли, а я проиграл... =(");
                break;
            } else if (answer < number) {
                System.out.println("Ваше число меньше, уахахахаха! Осталось " + (i - 1) + " попыток!");
                count++;
            } else {
                System.out.println(" Ваше число больше, пхахахаха!Осталось " + (i - 1) + " попыток!");
                count++;
            }
        }
        System.out.println("Проиграл, бывает");
        boolean answer1 = true;
        System.out.println("Повторим? 1 - Да, 2 - Тоже да, но нет");
    }
}
