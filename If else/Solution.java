import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      //String ans="";
          
      
      if(n%2==1){
         System.out.println("Weird");
      }
      if (n%2 == 0)
        {
        if (2<= n && n<= 5)
            {
            System.out.println("Not Weird");
        }
        else if (6 <= n && n<= 20)
            {
            System.out.println("Weird");
        }
        else if (n >20 )
            {
            System.out.println("Not Weird");
        }
    }
   }
}
