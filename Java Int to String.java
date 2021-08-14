import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int In = sc.nextInt();
        sc.close();
        String str;
        if(-100<=In && In<=100){
            str = String.valueOf(In);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
