import java.util.Scanner;

public class FindDaPrime {
	public static void main( String[] args ){
			int low;
			int high;
			int count = 0;
			Scanner kb = new Scanner(System.in);
			
			System.out.println("Please enter a integer greater than 1: ");
			low = kb.nextInt();
			
			System.out.println("Please enter a integer greater than " + low);
			high = kb.nextInt();
			
			for(int i=low; i<high;i++){
				boolean isPrime = true;
				for(int j = 2; j<i; j++){
					if((i % j) == 0){ 
						isPrime = false; 
					}
				}
				if(isPrime){
					System.out.println( i + " is a prime");
					count++;
				}
			}
			System.out.println("Total primes between " + low + " and " + high);
			System.out.println("            " + count);
	}
}