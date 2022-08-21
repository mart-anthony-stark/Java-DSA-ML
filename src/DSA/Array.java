package DSA;

public class Array<T> {
	private int[] array;
	private int count;

	Array() {
		this.array = new int[1];
	}

	Array(int length) {
		this.array = new int[length];
	}

	void add(int item) {
		if (count == array.length) {
			int newArray[] = new int[count + 2];

			for (int i = 0; i < count; i++) {
				newArray[i] = array[i];
			}

			array = newArray;
		}

		array[count++] = item;
	}

	int getSize() {
		return count;
	}

	int get(int index) {
		if (index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		return array[index];
	}
}
