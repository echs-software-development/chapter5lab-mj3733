import java.util.Scanner;
 
public class Prob2 {
 public static void main(String[] args){
 int countPos = 0 ;
int countNeg = 0 ;
int count = 0, total = 0, number;

Scanner input= new Scanner(System.in);
System.out.println("Enter an integer, the input ends if it ends in 0: ");
number = input.nextInt();
 
while (number != 0){
 if (number > 0)
 countPos++;
 else if (number < 0)
 countNeg++;

 
total += number;
count++;
 
number = input.nextInt();
 
}
 
if (count == 0)
 System.out.println("No numbers are entered except 0");
else {
System.out.println("The number of positives is"+countPos);
System.out.println("The number of negatives is"+countNeg);
System.out.println("The total is"+ total);
System.out.println("The average is"+ total * 1.0/count);
  }
 }
}
