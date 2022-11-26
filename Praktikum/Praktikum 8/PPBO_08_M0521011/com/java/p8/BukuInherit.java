// Nama : Andika Kavin Septiano
// NIM  : M0521011

package com.java.p8;

public class BukuInherit extends Buku {
  public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {

    super(isbn, judul, penulis, penerbit, tahunTerbit);
    super.isbn = isbn;
    super.judul = judul;
    super.penulis = penulis;
    super.penerbit = penerbit;
    super.tahunTerbit = tahunTerbit;
  }
}

/*
 * Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? Jelaskan penyebab errornya!
 * Ada
 * Error saat akan mengakses super.penulis saat diakses dari class BukuInherit. Ini karena access mdoifier dari penulis pada class Buku adalah private sehingga penulis tidak dapat diakses diluar class Buku. 
 */
