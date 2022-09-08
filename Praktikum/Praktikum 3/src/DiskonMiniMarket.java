import java.util.Scanner;

public class DiskonMiniMarket {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Total pembelian : ");
    double total = sc.nextDouble(), pay = 0;
    sc.close();
    if(total > 125000) {
      pay = total * 0.8;
    } else if(total > 75000) {
      pay = total * 0.85;
    } else if(total > 50000) {
      pay = total * 0.95;
    }  else {
      pay = total;
    }

    System.out.println("Total yang harus dibayar : "+ pay);
  }
}