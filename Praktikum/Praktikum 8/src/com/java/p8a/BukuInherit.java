// Nama : Andika Kavin Septiano
// NIM  : M0521011

package com.java.p8a;

import com.java.p8.Buku;

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
 * Error saat akan mengakses super.isbn saat diakses dari class BukuInherit. Ini karena isbn pada class Buku tidak memiliki access modifier atau access modifier default  sehingga isbn tidak dapat diakses diluar package com.java.p8. 
 * 
 * Error saat akan mengakses super.penulis saat diakses dari class BukuInherit. Ini karena access mdoifier dari penulis pada class Buku adalah private sehingga penulis tidak dapat diakses diluar class Buku.
 * 
 * Error saat akan mengakses super.tahunTerbit saat diakses dari class BukuInherit. Ini karena tahunTerbit pada class Buku tidak memiliki access modifier atau access modifier default sehingga tahunTerbit tidak dapat diakses diluar package com.java.p8. 
 */