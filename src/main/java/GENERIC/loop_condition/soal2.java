package GENERIC.loop_condition;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta input tinggi piramida
        System.out.print("Berapa lapis?: ");
        int input = scanner.nextInt();

        //Loop setiap baris
        for (int i=1; i<=input; i++){
            // Cetak spasi
//            for (int j=1; j<=input-i; j++){
//                System.out.print(" ");
//            }
            //Cetak bintang
            for (int k=1; k<=i; k++){
                System.out.print(" *");
            }
            //Pindah ke baris berikutnya
            System.out.println();
        }
        scanner.close();
    }
}

