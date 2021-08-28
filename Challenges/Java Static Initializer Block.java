import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int bredth,height,area;
        Scanner sc = new Scanner(System.in);
        bredth = sc.nextInt();
        height = sc.nextInt();
        if(bredth>0 && bredth<100 && height<100 && height>0){
            area=bredth*height;
            System.out.println(area);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
