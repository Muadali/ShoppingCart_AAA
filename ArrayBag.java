

	public class ArrayBag <T> implements BagInterface<T> {

		private static final int DEFAULT_CAPACITY = 25;

		  private T[] bag;

		  private int numberOfEntries;

		   

		  public ArrayBag() {

		      this(DEFAULT_CAPACITY);

		  }

		   

		  public ArrayBag(int capacity) {

		      numberOfEntries = 0;

		      @SuppressWarnings("unchecked")

		      T[] tempBag = (T[])new Object[capacity];

		      bag = tempBag;

		  }



		  public int getCurrentSize() {

		      return numberOfEntries;

		  }



		  public boolean isEmpty() {

		      return numberOfEntries == 0;

		  }



		  public boolean add(T newEntry) {

		      boolean result = true;

		      if (isArrayFull()) {

		        result = false;

		      } else {

		        bag[numberOfEntries] = newEntry;

		        numberOfEntries++;

		      }

		      return result;

		  }



		  private boolean isArrayFull() {

		      return numberOfEntries >= bag.length;

		  }



		  public T remove() {

		      T result = null;

		      if (numberOfEntries > 0) {

		        numberOfEntries--;

		        result = bag[numberOfEntries];

		        bag[numberOfEntries] = null;

		      }

		      return result;

		  }



		  public boolean remove(T anEntry) {

		      int index = getIndexOf(anEntry);

		      T result = removeEntry(index);

		      return anEntry.equals(result);

		  }



		  public void clear() {

		      while (!isEmpty()) {

		        remove();

		      }

		  }



		  public int getFrequencyOf(T anEntry) {

		      int frequency = 0;

		      int loopCounter = 0;

		      while (loopCounter < numberOfEntries) {

		        if (anEntry.equals(bag[loopCounter])) {

		            frequency++;

		        }

		        loopCounter++;

		      }

		      return frequency;

		  }



		  public boolean contains(T anEntry) {

		      return getIndexOf(anEntry) > -1;

		  }



		  private int getIndexOf(T anEntry) {

		      int where = -1;

		      boolean stillLooking = true;

		      int index = 0;

		      while (stillLooking && (index < numberOfEntries)) {

		        if (anEntry.equals(bag[index])) {

		            stillLooking = false;

		            where = index;

		        } else {

		            index++;

		        }

		      }

		      return where;

		  }



		  private T removeEntry(int givenIndex) {

		      T result = null;

		      if (!isEmpty() && (givenIndex >= 0)) {

		        result = bag[givenIndex];

		        int lastIndex = numberOfEntries - 1;

		        bag[givenIndex] = bag[lastIndex];

		        bag[lastIndex] = null;

		        numberOfEntries--;

		      }

		      return result;

		  }



		  public T[] toArray() {

		      @SuppressWarnings("unchecked")

		      T[] result = (T[]) new Object[numberOfEntries];

		      for (int index = 0; index < numberOfEntries; index++) {

		        result[index] = bag[index];

		      }

		      return result;

		  



		}



}
