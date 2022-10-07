import java.util.Scanner;

public class No3 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        char a =  scanner.next().charAt(0);
        char b =  scanner.next().charAt(0);
        
        if((int)a>(int)b) {
            char temp = a;
            a = b;
            b = temp;
        }
        
        for(int i =(int)a;i<=b; i++) {
            System.out.print(Character.toString((char) i));
        }
    }
}
