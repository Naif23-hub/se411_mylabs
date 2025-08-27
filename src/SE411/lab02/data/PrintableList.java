package SE411.lab02.data;

import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {
	
	private List<T> elements;
	
	public PrintableList(T... _elements) {
		elements = Arrays.asList(_elements);	
	}
	
	public void printAll() {
		for(T e: elements) {
			System.out.println(e);
		}
	}
}
