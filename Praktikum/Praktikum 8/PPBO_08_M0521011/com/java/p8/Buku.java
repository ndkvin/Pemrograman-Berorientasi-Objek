// Nama : Andika Kavin Septiano
// NIM  : M0521011

package com.java.p8;

public class Buku {
  public String isbn;
  public String judul;
  public String penulis;
  public String penerbit;
  public int tahunTerbit;

  public Buku(String isbn, String judul, String penulis,String penerbit, int tahunTerbit) {
    this.isbn = isbn;
    this.judul = judul;
    this.penulis = penulis;
    this.penerbit = penerbit;
    this.tahunTerbit = tahunTerbit;
  }

  public void printDataBuku() {
    System.out.println("ISBN: " + this.isbn);
    System.out.println("Judul: " + this.judul);
    System.out.println("Penulis: " + this.penulis);
    System.out.println("Penerbit: " + this.penerbit);
    System.out.println("Tahun terbit: " + this.tahunTerbit);
  }

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

