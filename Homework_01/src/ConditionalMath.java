import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
			System.out.print("Ievadiet savu v�rdu: ");
			String myName = ievade.nextLine();
			System.out.print("Ievadiet veselu skaitli A: ");
			int a = ievade.nextInt();
			System.out.print("Ievadiet veselu skaitli B: ");
			int b = ievade.nextInt();
			if (a > b) {
				System.out.println("Skaitlis " + a + " ir liel�ks par skaitli " + b + "!");
			} else if (b > a) {
				System.out.println("Skaitlis " + a + " nav liel�ks par skaitli " + b + "!");
			} else {
				System.out.print("Skait�i A un B ir vien�di");
			}
			int z = a + b;
			int nameLen = myName.length();
			if (z == nameLen) {
				System.out.println("Skait�a " + a + " un skait�a " + b + " summa ir " + z
						+ " kas ir tikpat cik burti tav� v�rd�!");
			} else if (z > nameLen) {
				System.out.println("Skait�a " + a + " un skait�a " + b + " summa ir " + z
						+ " kas ir vair�k nek� burti tav� v�rd�!");
			} else {
				System.out.println("Skait�a " + a + " un skait�a " + b + " summa ir " + z
						+ ", kas ir maz�k nek� burti tav� v�rd�!");

			}
		}
	}

}
