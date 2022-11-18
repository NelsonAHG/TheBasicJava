import java.util.Scanner;

// reverse input text
public class Module {

	public static void main(String[] args) {
		Scanner entry = new Scanner(System.in);

		int Number, ModuleNumber;

		System.out.println("---- calculation of the module------");
		System.out.println(" enter a number ");
		Number = entry.nextInt();

		ModuleNumber = (Number < 0) ? ModuleNumber = Number * (-1) : Number;
		System.out.println(" The Number Module is " + ModuleNumber);
	}

}
