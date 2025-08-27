package SE411.lab02.data;

public class Numberbox<T extends Number> {
	 
	private T element;
	
	public Numberbox(T _element) {
		element = _element;
	}
	
	public T getElement() {
		return element;
	}
	
	public void setElement(T element) {
		this.element = element;
		
	}
	
}
