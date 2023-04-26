import java.util.ArrayList;

public class ObjectList<T> extends ArrayList<T> {

	private T value;

	public boolean add(T val) {
		return super.add(val);
	}

	public T get() {
		return this.value;
	}
}