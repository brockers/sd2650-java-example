import java.util.Scanner;

public class LifeUniverse {
	public static void main( String[] args ){
			boolean i = true;
			int answer;
			Scanner kb = new Scanner(System.in);
			
			while(i){
				System.out.println("Please enter a number: ");
				answer = kb.nextInt();
				if(answer == 42){
					System.out.println("Life, the Universe, and Everything!!!!!");
					i = false;
				} else {
					System.out.println("          " + answer);
				}
			}
	}
}