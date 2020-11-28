import java.util.Scanner;
import static java.lang.Math.*;
public class BasicMath {
	public static void main(String[] args) {
		try (Scanner ievade = new Scanner(System.in)) {
			System.out.print("Ievadiet veselu skaitli: ");
			int x = ievade.nextInt();
			System.out.print("Ievadiet decimâldaïskaitli: ");
			float yf = ievade.nextFloat();

			float sum = x + yf;
			System.out.println("Skaitïu " + x + " un" + yf + " summa ir: " + sum);

			float sub = x - yf;
			System.out.println("Skaitïu " + x + " un" + yf + " starpîba ir: " + sub);

			float div = x / yf;
			System.out.println("Skaitïu " + x + " un" + yf + " dalîjums ir: " + div);

			float mlt = x * yf; 
			System.out.println("Skaitïu " + x + " un" + yf + " reizinâjums ir: " + mlt); 
			
			float pow = (float) pow(x+yf,2); 
			System.out.println("Skaitïu " + x + " un" + yf + " summa kvadrâtâ ir: " + pow);
			
		}
	}
}