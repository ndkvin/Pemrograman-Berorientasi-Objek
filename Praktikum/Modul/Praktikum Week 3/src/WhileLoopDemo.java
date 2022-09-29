import java.util.concurrent.TimeUnit;

public class WhileLoopDemo {
  public static void main(String[] args) {
    int i = 0;
    while (true) {
      if (i % 3 == 0 && i != 0)
        System.out.println("Hello ke-" + i);

      if (i == 300)
        break;

      i++;
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  }
}
