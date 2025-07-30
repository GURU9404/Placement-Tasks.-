import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = 0;
        int absB = b < 0 ? -b : b; 
        
        for (int i = 0; i < absB; i++) {
            result += a;
        }
        
        if (b < 0) {
            result = -result;  
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
