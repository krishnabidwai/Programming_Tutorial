import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Integer x = scan.nextInt();
		
		for(int i = 1; i <= x; i++) {
			
			if(i%2 == 0) {
				
				System.out.println("Even Number "+i);
				
			}else {
				
				System.out.println("Odd Number "+i);
			}
		}
		
		
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
