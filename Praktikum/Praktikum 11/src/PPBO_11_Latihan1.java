//  Nama    : Andika Kavin Septiano
//  NIM     : M0521011

class MyThread extends Thread {
  int length;
  String marker;

  public MyThread(int length, String marker){
      this.length = length;
      this.marker = marker;

      var mainThread = Thread.currentThread().getName();
      System.out.println(this.getName() + " is created on " + mainThread);
  }

  @Override
  public void run(){
      int count = 0;
      while(count < length){
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }

          count++;
          var progressString = getProgress(count, marker);
          System.out.println(this.getName() + ": " + progressString);
      }
  }

  private String getProgress(int count, String marker){
      var result = "";
      for(int i=0; i<count; i++){
          result+=marker;
      }

      return result;
  }
}

public class PPBO_11_Latihan1 {
  public static void main(String[] args) {
      System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

      var thread1 = new MyThread(10, "#");
      var thread2 = new MyThread(5, ">");

      thread1.start();

      try {
        Thread.sleep(1500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      thread2.start();
  }
}

/* 
* Jawablah pertanyaan berikut
* 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
*    Jawab : Terjadi error karena InterruptedException pada fungsi sleee() tidak di handdle menggunakan try catch
* 
* 
* 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
*    Jawab : Menambahkan try catch untuk menghandle InterruptedException
* 
* 
* 3. Jelaskan secara singkat algoritma program di atas
*    Jawab : Terdapat class MyThread yang mengextends class Thread, saat membuat objek dari 
*             class MyThread akan membuat thread baru.
              Program akan membuat 2 MyThread
              thread1 akan menampilkan # sebanyak 10 kali dimana setiap menampilkan akan menambahkan # sebanyak 1
              thread2 akan menampilkan > sebanyak 5 kali dimana setiap menampilkan akan menambahkan > sebanyak 1

*    
* 
*/