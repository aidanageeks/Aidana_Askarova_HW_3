public class Main {
    public static void main(String[] args) {
        double numbers[] = {0.6, 8.6, -9.2, 4.0, 4.8, 2.3, 5.2, -7.5, 8.4, 6.9, -2.3, 7.8, 6.9, -2.4, 1.8};
        boolean firstNegative = false;
        double sumNumbers = 0;
        int count = 0;
        for (double number : numbers) {

            if (number < 0) {
                firstNegative = true;
            } else if (number > 0 && firstNegative) {
                count = count + 1;
                sumNumbers = sumNumbers + number;
                System.out.println(number);
            }
        }
        System.out.println(sumNumbers / count);
    }
}