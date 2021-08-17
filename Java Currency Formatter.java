import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        String us, india, china, france; 
        
        // Write your code here.
        NumberFormat n1= NumberFormat.getCurrencyInstance(Locale.US);
        us = n1.format(payment);
        NumberFormat n2= NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        india = n2.format(payment);
        NumberFormat n3= NumberFormat.getCurrencyInstance(Locale.CHINA);
        china = n3.format(payment);
        NumberFormat n4= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        france = n4.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
        
    }
}
