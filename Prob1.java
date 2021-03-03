import java.util.Scanner;
 
public class Prob1 {
 public static void main(String[] args){
 
Scanner scan = new Scanner(System.in);
 
System.out.println("How many grades would you like to enter: ");
 
int times = scan.nextInt();
int gradessum = 0 ;
for(int x = 1 ; x <= times; x++  ){
 
 
System.out.println("Enter a grade" + x);
 
int grade = scan.nextInt();
 
gradessum += grade ;
 
}
 
System.out.println("The sum of the grades is: " + gradessum);
  }
}
