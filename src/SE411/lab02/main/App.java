package SE411.lab02.main;

import SE411.lab02.data.PrintableList;

public class App {

	public static void main(String[] args) {
		PrintableList<String> plist = new PrintableList<>("Salem", "Hello", "Ciao");
		plist.printAll();

	}

}
