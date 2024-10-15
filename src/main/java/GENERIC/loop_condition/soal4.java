package GENERIC.loop_condition;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double Sn;
        Sn = n/2 * (2*a * (n-1) * d);
        System.out.println("Sn = " + Sn);
    }
}
