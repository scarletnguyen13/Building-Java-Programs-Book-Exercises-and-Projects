import java.util.Arrays;

public class ArrayIntList implements IntList{
	//Field
	public static final int DEFAULT_CAPACITY = 100;
	private int[] elementData; // list of integers
	private int size;		   // number of elements in the list
	
	//Constructor #1
	public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
	
	// pre : capacity >= 0 (throws IllegalArgumentException if not)
	// post: constructs an empty list with the given capacity
	//Constructor #2
	public ArrayIntList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity: " + capacity);
		}
		elementData = new int[capacity];
		size = 0;
	}
	
	// post: checks that the underlying array has the given capacity,
	// throwing an IllegalStateException if it does not
	private void checkCapacity(int capacity) {
		if (capacity > elementData.length) {
			throw new IllegalStateException("exceeds list capacity");
		}
	}
	
	// pre : size() < capacity
	// post: appends the given value to the end of the list
	public void add(int value) {
		checkCapacity(size + 1);
		elementData[size] = value;
		size++;
	}
	
	// pre : size() < capacity && 0 <= index <= size()
	// post: inserts the given value at the given index, shifting
	// subsequent values right
	public void add(int index, int value) {
		checkCapacity(size + 1);
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
		for (int i = size; i >= index + 1; i--) {
			elementData[i] = elementData[i - 1];
		}
		elementData[index] = value;
		size++;
	}
	
	public void addAll(ArrayIntList other) {
		checkCapacity(size + other.size);
		for (int i = 0; i < other.size; i++) {
			add(other.elementData[i]);
		}
	}
	
	// pre : 0 <= index < size()
	// post: removes value at the given index, shifting
	// subsequent values left
	public void remove(int index) {
		checkIndex(index);
		for (int a = index; a < size - 1; a++) {
			elementData[a] = elementData[a + 1];
		}
		size--;
	}
	
	// post: returns the current number of elements in the list
	public int length() {
		return this.size;
	}
	
	// post: throws an IndexOutOfBoundsException if the given index is
	// not a legal index of the current list
	private void checkIndex(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index: " + index);
		}
	}
	
	// pre : 0 <= index < size()
	// post: returns the integer at the given index in the list
	public int get(int index) {
		checkIndex(index);
		return elementData[index];
	}
	
	// pre : 0 <= index < size()
	// post: sets the given value at the given index in the list
	public void set(int index, int value) {
		checkIndex(index);
		elementData[index] = value;
	}
	
	// post : returns the position of the first occurrence of the
	// given value (–1 if not found)
	public int indexOf(int value) {
		for (int a = 0; a < size; a++) {
			if (elementData[a] == value) {
				return a;
			}
		}
		return -1;
	}
	
	public boolean contains(int value) {
		return indexOf(value) >= 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void clear() {
		size = 0;
	}
	
	public void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int newCapacity = elementData.length * 2 + 1;
			if (capacity > newCapacity) {
				newCapacity = capacity;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}
	
	public ArrayIntListIterator iterator() {
		return new ArrayIntListIterator(this);
	}
	
	// post: returns comma-separated, bracketed version of list
	public String toString() {
		if (this.size == 0) {
			return "[]";
		} else {
			String result = "[" + elementData[0];
			for (int i = 1; i < size; i++) {
				result += ", " + elementData[i];
			}
			return result + "]";
		}
	}
}
