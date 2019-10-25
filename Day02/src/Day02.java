import java.util.Scanner;

public class Day02 {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		
		Scanner in = new Scanner (System.in);
		//String s = in.nextLine();
		
		/*if(s.equals("Fatai")) {
			System.out.println("Hey Fatai");
		} else if (s.equals("Sola")) {
			System.out.println("Hey Sola");
		} else {
			System.out.println("Fuck off!");
		*/
		
		/*
		int i = 0; //initialisation 
		while (i < 10) { //condition
			System.out.println("i is: " + i);
			i++; //update
		}
		*/
		
		/*for(int i = 0; i < 10; i++) {
			System.out.println(i );
		}
		*/
		in.close();	
		
		int i = 0;
		do {
			System.out.println("i is: " + i);
			i++;
		} while (i < 10);
			
	}
}
