import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
        String B;
        StringBuilder sb = new StringBuilder(A);
        B = sb.reverse().toString();
        if(A.equals(B)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



