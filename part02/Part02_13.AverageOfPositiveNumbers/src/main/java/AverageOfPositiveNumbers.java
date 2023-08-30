
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfPositives = 0;
        int countPositives = 0;

        while (true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                sumOfPositives += number;
                countPositives++;
            } else if (number == 0) {
                double averageOfPositives = (double) sumOfPositives / countPositives;
                System.out.println("Average of positives is: " + averageOfPositives);
                break;
            } else if (number < 0) {
                continue;
            } else if (countPositives == 0) {
                System.out.println("Cannot calculate the average");
                break;
            }

        }
    }
}
