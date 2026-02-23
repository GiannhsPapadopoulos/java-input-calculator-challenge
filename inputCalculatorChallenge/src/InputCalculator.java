import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            String number = scanner.nextLine();
            try {
                int validNumber = Integer.parseInt(number);
                sum = sum + validNumber;
                counter++;
            } catch (NumberFormatException nfe) {
                long average = 0;
                if (counter > 0) {
                    average = Math.round((double)sum / counter);
                }
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scanner.close();
    }
}