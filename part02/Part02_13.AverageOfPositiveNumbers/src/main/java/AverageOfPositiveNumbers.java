
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfPositives = 0;
        int countPositives = 0;
        int countNumber = 0;;

        while (true) {
            System.out.println("Give a number: ");
            int number = scanner.nextInt();
            double averageOfPositives = (double) sumOfPositives / countPositives;

            if (number > 0) {
                sumOfPositives += number;
                countPositives++;
                countNumber++;
            }if (number == 0 && countNumber == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else if (number == 0) {
                System.out.println("The average of positive numbers is :" + averageOfPositives);
                break;
            }

        }
    }
}
