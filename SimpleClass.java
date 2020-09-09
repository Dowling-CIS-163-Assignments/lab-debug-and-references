package labReferencesGIVE_TO_STUDENTS;

public class SimpleClass {
	private int value;
	private static int numberOfInst;

	public SimpleClass(int number) {
		value = number;
		numberOfInst++;
	}

	public String toString() {
		return "" + value;
	}

	public void incr() {
		value++;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
