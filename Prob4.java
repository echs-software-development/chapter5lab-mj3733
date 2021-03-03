import java.util.Scanner;
 
public class Prob4 {
 public static void main(String[] args){
 
 int count = 1;
 for(int x = 100; x <= 1000; x++)
   if(x % 5 == 0 && x % 6 == 0 )
 System.out.print((count++ % 10 != 0) ? x + " " : x  + "\n");
 
 
 }
}
