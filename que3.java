	// Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.  

	 
 
 
 
// lastDigit(7, 17) → true  
 
 
// lastDigit(6, 17) → false  
 
 
// lastDigit(3, 113) → true  
  
import java.util.Scanner; 
  
public class que3 { public static void main(String[] args) { Scanner sc = new Scanner(System.in); 
int a = sc.nextInt(); // cin>>a; int b = sc.nextInt(); 
  
int c = a % 10; //%10 is used to check last digit of number int d = b % 10; 
  
if (c == d){ 
System.out.println("true"); 
} 
else 
System.out.println("false"); 
} 
} 
 
