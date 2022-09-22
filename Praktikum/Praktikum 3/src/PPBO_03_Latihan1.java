// Nama : Andika Kavin Septiano
// NIM  : M0521011

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        System.out.print("Masukan nominal total belanjaan : ");
        double input = sc.nextDouble();
        double pay=0;
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if(input > 125000) {
          pay = input * 0.8;
        } else if(input > 75000) {
          pay = input * 0.85;
        } else if(input > 50000) {
          pay = input * 0.95;
        }  else {
          pay = input;
        }
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Nominal yang harus dibayar adalah "+ pay);
        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000