// Nama : Andika Kavin Septiano
// NIM  : M0521011

package com.java.p8;

public class ClassX {
public static void main(String[] args) {
// buat objek buku
    Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

    // tampilkan data buku lewat method printDataBuku
    buku.printDataBuku();

    // akses ke variabel yang ada di objek buku
    System.out.println(buku.isbn);
    System.out.println(buku.judul);
    System.out.println(buku.penulis);
    System.out.println(buku.penerbit);
    System.out.println(buku.tahunTerbit);
  }
}


/*
 * Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? Jelaskan penyebab errornya! 
 * Ada.
 * Error saat akan mengakses buku.penulis saat diakses dari ClassX. Ini karena access mdoifier dari penulis pada class Buku adalah private sehingga penulis tidak dapat diakses diluar kelas Buku. 
 */