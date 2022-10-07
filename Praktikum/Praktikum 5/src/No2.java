import java.util.Scanner;

public class No2 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();

        if(input.matches("^[aiueoAIUEO].*")) {
            System.out.println(1);
        } else if(input.matches(".*ng$")) {
            System.out.println(2);
        } else {
            System.out.println(-1);
        }
    }
}