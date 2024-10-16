package exercise.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageGreaterThan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        ArrayList<Double> greater = new ArrayList<>();
        double sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        int countGreaterThanAverage = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > average) {
                countGreaterThanAverage++;
                greater.add(numbers[i]);
            }
        }
        System.out.println("Average: " + average);
        System.out.println("Number of items greater than the average: " + countGreaterThanAverage);
        System.out.println("Greater than the average: " + greater);
    }
}
