import java.util.Scanner;
import static java.lang.Math.*;
public class BasicMath {
	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
			System.out.print("Ievadiet veselu skaitli: ");
			int x = ievade.nextInt();
			System.out.print("Ievadiet decim�lda�skaitli: ");
			float yf = ievade.nextFloat();

			float sum = x + yf;
			System.out.println("Skait�u " + x + " un" + yf + " summa ir: " + sum);

			float sub = x - yf;
			System.out.println("Skait�u " + x + " un" + yf + " starp�ba ir: " + sub);

			float div = x / yf;
			System.out.println("Skait�u " + x + " un" + yf + " dal�jums ir: " + div);

			float mlt = x * yf; 
			System.out.println("Skait�u " + x + " un" + yf + " reizin�jums ir: " + mlt); 
			
			float pow = (float) pow(x+yf,2); 
			System.out.println("Skait�u " + x + " un" + yf + " summa kvadr�t� ir: " + pow);
			
		}
	}
}