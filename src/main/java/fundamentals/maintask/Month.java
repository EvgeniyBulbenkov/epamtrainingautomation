package fundamentals.maintask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {
    public static void main(String[] args) {

        System.out.println("Введите номер месяца (чесло от 1 до 12)");

        while(true) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                int month = Integer.parseInt(reader.readLine());
                if (month >= 1 & month <= 12) {
                    showMONTH(month);
                    break;
                }

                else throw new NumberFormatException();
            } catch (NumberFormatException ex) {
                System.out.println("\nОщибка ввода!!!! Введите число от 1 до 12\n");

            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    private static void showMONTH(int month) {
        switch (month) {

            case 1:
                System.out.println("Месяц: январь");
                break;
            case 2:
                System.out.println("Месяц: февраль");
                break;
            case 3:
                System.out.println("Месяц: март");
                break;
            case 4:
                System.out.println("Месяц: апрель");
                break;
            case 5:
                System.out.println("Месяц: мвй");
                break;
            case 6:
                System.out.println("Месяц: июнь");
                break;
            case 7:
                System.out.println("Месяц: июль");
                break;
            case 8:
                System.out.println("Месяц: август");
                break;
            case 9:
                System.out.println("Месяц: сентябрь");
                break;
            case 10:
                System.out.println("Месяц: октябрь");
                break;
            case 11:
                System.out.println("Месяц: ноябрь");
                break;
            case 12:
                System.out.println("Месяц: декабрь");
                break;
        }

    }
}
