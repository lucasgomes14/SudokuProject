import java.util.Scanner;

import Services.Index.OptionAlpha;
import Services.Index.OptionNumber;
import Services.tabuleiro.PrintBoard;

public class App {
    public static void main(String[] args) throws Exception {
		/*OptionAlpha alpha = new OptionAlpha();
		OptionNumber number = new OptionNumber();*/
		PrintBoard p = new PrintBoard();
		p.print();
    }
}
