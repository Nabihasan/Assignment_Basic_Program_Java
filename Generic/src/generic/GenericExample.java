package generic;

public class GenericExample<T> {
	T value;
	public GenericExample(T value) {
		this.value=value;
	}
	
	public T getValue() {
		return this.value;
	}
}
