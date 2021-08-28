import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String A = a.toLowerCase();
        String B = b.toLowerCase();
        Boolean f= false;
        if(A.length() == B.length()){
            char aArray[] = A.toCharArray();
            char bArray[] = B.toCharArray();
            
            for(int i = 0;i<A.length();i++){
                
                System.out.println(aArray[i]+" "+bArray[i]);
                
                if(aArray[i] == bArray[i]){
                    f= true;
                }
                else{
                   f=false;
                }
            }
        }
        else{
            f=false;
        }
        return f;
    }

  public static void main(String[] args) {