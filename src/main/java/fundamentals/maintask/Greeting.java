package fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greeting {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите Ваше имя");
        System.out.println("* для отмены введите 'stop'");

        try {
            String name = reader.readLine();
            if (name.equals("stop"))
                return;
            else
                System.out.println("Здравствуйте, " + name + "!");

        } catch (IOException e) {
            System.out.println("Возникла ошибка!");
        }

    }
}
