package lesson_05;

import java.util.Arrays;

public class Stack {

	public static final int MAX_STACK_SIZE = 5;
	boolean full = false;
	boolean empty = true;

	String[] array = new String[MAX_STACK_SIZE];
	int pointer = 0;

	public boolean push(String newElement) {
		if (!full) {
			array[pointer] = newElement;
			pointer++;
			empty = false;
			if (pointer == MAX_STACK_SIZE) {
				full = true;
			}
			return true;
		} else
			return false;
	}

	public String pop() {
		String lastItem = null;
		if (!empty) {
			lastItem = array[pointer - 1];
			array[pointer - 1] = null;
			pointer--;
			if (pointer != MAX_STACK_SIZE)
				full = false;
			if (pointer == 0)
				empty = true;
		}
		return lastItem;
	}

	public void clear() {
		// arrayin tum elemanlar�na null deger atar.
		Arrays.fill(array, null);
		pointer = 0;
		empty = true;
		full = false;

	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isFull() {
		return full;
	}

	public int size() {
		return pointer;
	}

	public int getCapasity() {
		return MAX_STACK_SIZE;
	}

	public void showElements() {
		System.out.println("*** Elements in the Stack ***");
		if (!empty)
			for (String s : array) {
				if (s != null)
					System.out.println(s);
			}
		else
			System.out.println("Nothing in the Stack");
	}
}
