import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int a= A.length();
        int b= B.length();
        System.out.println(a+b);
        
        if(a>=b){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);;
        System.out.println(atemp+" "+btemp);
    }
}
