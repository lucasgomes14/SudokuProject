package Services.Index;

import java.util.Scanner;

public class OptionNumber {

	public OptionNumber() {
	}
	
	public int scannerNumber() {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Digite um número de 1 a 9: ");
			number = sc.nextInt();
		} while (number < 1 || number > 9);
		return numberIndex(number);
	}

	public int numberIndex(int number) {
		return number - 1;
	}
}
