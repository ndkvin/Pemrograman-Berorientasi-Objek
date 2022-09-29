// Nama : Andika kavin Septiano
// NIM  : M0521011

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
// Jawab: 
/*
 * saat memasukan input berupa huruf maka program tidak akan berhenti 
 * dan tidak menghasilkan InputMismatchException error, melainkan hanya 
 * akan menampilkan kalimat "Input salah, masukkan angka" .
 * Ini karena InputMismatchException error sudah ditangani dengan 
 * menggunakan try...catch. Dimana block catch akan dijalankan ketika
 * terjadi InputMismatchException error.
 */