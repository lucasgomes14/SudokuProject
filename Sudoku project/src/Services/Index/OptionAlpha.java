package Services.Index;

import java.util.Scanner;

public class OptionAlpha {
	
	public OptionAlpha() {
	}

	public String scannerAlpha() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma letra de A a I: ");
		String alpha = sc.nextLine();
		return alpha;
	}

	public int inputAlpha() {
		String alpha = scannerAlpha();
		return line(alpha);
	}

	public int line(String alpha) {
		alpha = alpha.toLowerCase();
		int number = -1;
		
		while(number == -1){
			switch (alpha) {
				case "a":
					number = 0;
					break;
				case "b":
					number = 1;
					break;
				case "c":
					number = 2;
					break;		
				case "d":
					number = 3;
					break;
				case "e":
					number = 4;
					break;
				case "f":
					number = 5;
					break;
				case "g":
					number = 6;
					break;
				case "h":
					number = 7;
					break;
				case "i":
					number = 8;
					break;
				default:
					System.out.println("Digite um valor válido!");
					alpha = scannerAlpha();			
			}
		}
		return number;
	}
}
