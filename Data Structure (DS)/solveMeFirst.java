import java.io.*;
import java.util.*;

public class Solution {
     static int solveMeFirst(int a, int b) {
        return a+b;
   }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myObj = new Scanner(System.in);

        int a;
        a = myObj.nextInt();

        int b;
        b = myObj.nextInt();
        int sum;
        sum = solveMeFirst(a,b);
        System.out.println(sum);
        
    }
}
