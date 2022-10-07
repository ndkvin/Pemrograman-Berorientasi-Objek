import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class No1 {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        
        for(int i = 0; i<input.length();i++) {
            if(i%3==0) {
                System.out.print(input.charAt(i));
            }
        }
    }
}