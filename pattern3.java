import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if((i+j)%2!=0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
            
        }
        
    }
}
