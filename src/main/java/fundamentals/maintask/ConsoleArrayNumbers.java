package fundamentals.maintask;

public class ConsoleArrayNumbers {
    public static void main(String[] args) {
        if (args.length > 0) {

            int[] arr = new int[args.length];
            int sum = 0;
            int mult = 1;

            try {
                for (int i = 0; i < args.length; i++) {
                    arr[i] = Integer.parseInt(args[i]);
                }
            }
            catch (NumberFormatException ex) {
                System.out.println("\nНекорректно введены аргументы: допустим ввод ТОЛЬКО целых чисел\n");
            }
            for (int arg : arr) {
                sum += arg;
                mult *= arg;
            }
            System.out.println("Сумма аргументов командной строки: " + sum);
            System.out.println("Произведение аргументов командной строки: " + mult);
        }
    }
}
