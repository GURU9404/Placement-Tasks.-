import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {          // Declare i as int
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
