import java.util.Scanner;
 
public class Prob3 {
 public static void main(String[] args){
Scanner scan = new Scanner(System.in);
 
System.out.println("Enter number of students");
int numOfStudents = scan.nextInt();

System.out.println("Enter a students name: ");
String student1 = scan.nextLine();
System.out.println("Enter a student score");
double score1 = scan.nextDouble();
 
 
 for(int x = 0; x < numOfStudents -1 ; x++){
 System.out.print("Enter a student's name");
 String student = scan.nextLine();
 
System.out.print("Enter a student's score");
double score = scan.nextDouble();
 
if(score > score1){
student1 = student;
score1 = score;
 
 
 }
 
}
System.out.print("Top student" + student1 + "'s score is" + score1);
 }
}