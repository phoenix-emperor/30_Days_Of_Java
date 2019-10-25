import java.util.Scanner;

public class Day01 {

	public static void main(String[] args) {
		//System.out.println("Hello, World!");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Type your name: ");
		
		String n = in.nextLine();
		String g = "Hey " + n + ". How did your day go?";
		
		System.out.println(g);
		System.out.println("How old are you " + n);
		int ag = in.nextInt();	
		
		while(ag < 21) {
			System.out.println("Nice " + n + ", So you are born in ");
		} else {
			System.out.println("You are too young to ride this train"); 
		}
		//int a;
		//a = ag;
		

		in.close();	
		}
}