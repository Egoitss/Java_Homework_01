import java.util.Scanner;
public class GreetingsInteractive {
//Homework_01_Task_2 
	
	
	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
		System.out.print("Ievadiet savu vârdu: ");
		String myName = ievade.nextLine();
		System.out.print("Ievadiet savu vecumu: ");
		int myAge = ievade.nextInt();
		
		System.out.println("Mans vârds ir " + myName + ", esmu " + myAge + " gadus vecs!");

	}

}
}