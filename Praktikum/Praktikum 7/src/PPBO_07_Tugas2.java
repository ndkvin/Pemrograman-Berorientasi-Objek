// Nama : Andika Kavin Septiano
// NIM  : M0521011

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PPBO_07_Tugas2 {
  public String ketikTeks() {
    System.out.println("Ketik kalimat yang akan disimpan :");
    Scanner sc = new Scanner(System.in);
    // ambil 1 kalimat, setelah tekan enter teks akan diambil
    String str1 = sc.nextLine();
    sc.close();
    return str1;
  }

  public void simpanTeks(String teks) {
    // set up file and stream
    // ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
    try {
      File outFile = new File("sample4.data");
      FileOutputStream fileOutputStream = new FileOutputStream(outFile);
      DataOutputStream dataOutputStream;
      dataOutputStream = new DataOutputStream(fileOutputStream);
      dataOutputStream.writeBytes(teks);
      dataOutputStream.close();
    } catch(FileNotFoundException e) {
      e.printStackTrace();
    }catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("file berhasil disimpan");
  }

  public static void main(String[] args) {
    PPBO_07_Tugas2 it = new PPBO_07_Tugas2();
    // memanggil method ketikTeks
    String kalimat = it.ketikTeks();
    // memanggil method simpanTeks
    it.simpanTeks(kalimat);
  }
}

/*
 *  jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes()
 *  - PrintWriter.write() digunakan untuk menulis satu spesifik karakter ke output stream pada satu waktu
 *  - DataOutputStream.writeBytes() Digunakan untuk menulis string ke output stream dalam bentuk urutan byte
 *    
 */ 