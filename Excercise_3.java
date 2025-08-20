package levin27;
import java.util.Scanner;
public class Fibonacciseries{
	public static int Fibonacci(int n) {
		if(n<=1) {
			return n;
		}
		  return Fibonacci(n-1)+Fibonacci(n-2);
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number:");
	int terms =sc.nextInt();
	System.out.println("Fibonacci sequence:");
	for(int i =0;i<terms;i++) {
		System.out.println(Fibonacci(i)+" ");
	}
}
	
	
