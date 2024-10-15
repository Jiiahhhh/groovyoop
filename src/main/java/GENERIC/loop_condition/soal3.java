package GENERIC.loop_condition;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean prima = true;

        System.out.print("Enter number: ");
        int a = scanner.nextInt();

        if (a <= 1){
            prima = false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0){
                    prima = false;
                    break;
                }
            }
        }
        if (prima){
            System.out.println("Prima");
        } else {
            System.out.println("Not Prima");
        }
    }
}
