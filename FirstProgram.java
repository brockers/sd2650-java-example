import java.util.Scanner;
import lib.Example;

public class FirstProgram {
	public static void main( String[] args ){
		String name;
		int age;
		int addage = 10;
		int total;
		
		String top = "====================================================";
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = kb.next();
		
		System.out.println("What is your age?");
		age = kb.nextInt();
		
		System.out.println(top);
		System.out.println("Wow " + name + " you are really old");
		
		total = Example.add(age,addage);
		System.out.println("In 10 years you will be " + total);
		
	}
}