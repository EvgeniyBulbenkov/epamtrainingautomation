package fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomOutput {

    public static void main(String[] args) {
        int count;
        int[] arr;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Сколько (укажите число) случвйных чисел вывести? ");
                count = Integer.parseInt(reader.readLine());
                arr = new int[count];
                for (int i = 0; i < count; i++) {
                    arr[i] = (int) (Math.random() * 10);
                }
                break;
            }
            catch (NumberFormatException numEx) {
                System.out.println("Ошибка!!! Введите число!!! \n");
            }
            catch (IOException io) {
                io.toString();
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
