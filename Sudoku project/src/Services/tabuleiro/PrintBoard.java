package Services.tabuleiro;

import java.util.ArrayList;
import java.util.List;

public class PrintBoard {

	public PrintBoard() {
	}
	
	public void print() {
		List<String> tab = new ArrayList<>();
		tab.add("    1  2  3     4  5  6     7  8  9   ");	
		tab.add("  ___________________________________ ");
		tab.add("A|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("B|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("C|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |___________|___________|___________|");
		tab.add("D|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("E|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("F|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |___________|___________|___________|");
		tab.add("G|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("H|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |           |           |           |");
		tab.add("I|  .  .  .  |  .  .  .  |  .  .  .  |");
		tab.add(" |___________|___________|___________|");

		for (String t : tab) {
			System.out.println(t);
		}
	}
}
