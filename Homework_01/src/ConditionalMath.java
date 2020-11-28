import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
			System.out.print("Ievadiet savu vârdu: ");
			String myName = ievade.nextLine();
			System.out.print("Ievadiet veselu skaitli A: ");
			int a = ievade.nextInt();
			System.out.print("Ievadiet veselu skaitli B: ");
			int b = ievade.nextInt();
			if (a > b) {
				System.out.println("Skaitlis " + a + " ir lielâks par skaitli " + b + "!");
			} else if (b > a) {
				System.out.println("Skaitlis " + a + " nav lielâks par skaitli " + b + "!");
			} else {
				System.out.print("Skaitïi A un B ir vienâdi");
			}
			int z = a + b;
			int nameLen = myName.length();
			if (z == nameLen) {
				System.out.println("Skaitïa " + a + " un skaitïa " + b + " summa ir " + z
						+ " kas ir tikpat cik burti tavâ vârdâ!");
			} else if (z > nameLen) {
				System.out.println("Skaitïa " + a + " un skaitïa " + b + " summa ir " + z
						+ " kas ir vairâk nekâ burti tavâ vârdâ!");
			} else {
				System.out.println("Skaitïa " + a + " un skaitïa " + b + " summa ir " + z
						+ ", kas ir mazâk nekâ burti tavâ vârdâ!");

			}
		}
	}

}
