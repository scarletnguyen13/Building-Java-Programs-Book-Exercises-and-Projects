import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E>{
	//Field
		public static final int DEFAULT_CAPACITY = 100;
		private E[] elementData; // list of integers
		private int size;		   // number of elements in the list
		
		//Constructor #1
		public ArrayList() {
			this(DEFAULT_CAPACITY);
		}
		
		// pre : capacity >= 0 (throws IllegalArgumentException if not)
		// post: constructs an empty list with the given capacity
		//Constructor #2
		@SuppressWarnings("unchecked")
		public ArrayList(int capacity) {
			if (capacity < 0) {
				throw new IllegalArgumentException("capacity: " + capacity);
			}
			elementData = (E[]) new Object[capacity];
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
		public void add(E value) {
			checkCapacity(size + 1);
			elementData[size] = value;
			size++;
		}
		
		// pre : size() < capacity && 0 <= index <= size()
		// post: inserts the given value at the given index, shifting
		// subsequent values right
		public void add(int index, E value) {
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
		
		public void addAll(ArrayList<E> other) {
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
			elementData[size - 1] = null;
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
		public E get(int index) {
			checkIndex(index);
			return elementData[index];
		}
		
		// pre : 0 <= index < size()
		// post: sets the given value at the given index in the list
		public void set(int index, E value) {
			checkIndex(index);
			elementData[index] = value;
		}
		
		// post : returns the position of the first occurrence of the
		// given value (–1 if not found)
		public int indexOf(E value) {
			for (int a = 0; a < size; a++) {
				if (elementData[a].equals(value)) {
					return a;
				}
			}
			return -1;
		}
		
		public boolean contains(E value) {
			return indexOf(value) >= 0;
		}
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		public void clear() {
			for (int i = 0; i < size; i++) {
				elementData[i] = null;
			}
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
		
		public ArrayListIterator iterator() {
			return new ArrayListIterator(this);
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
		
		private class ArrayListIterator implements Iterator<E> {
			private ArrayList<E> list;
			private int position;
			private boolean removeOK;
			
			public ArrayListIterator(ArrayList<E> list) {
				this.list = list;
				position = 0;
				removeOK = false;
			}
			
			// post: returns true if there are more elements left
			public boolean hasNext() {
				// check position against size of the list
				return position < length();
			}
			
			// pre : hasNext() (throws NoSuchElementException if not)
			// post: returns the next element in the iteration
			public E next() {
				if (!hasNext()) {
					throw new NoSuchElementException();
				}
				E result = list.get(position);
				position++;
				removeOK = true;
				return result;
			}
			
			// pre : next() has been called without a call on remove
			// (throws IllegalStateException if not)
			// post: removes the last element returned by the iterator
			public void remove() {
				if (!removeOK) {
					throw new IllegalStateException();
				}
				ArrayList.this.remove(position-1);
				position--;
				removeOK = false;
			}
		}
}
