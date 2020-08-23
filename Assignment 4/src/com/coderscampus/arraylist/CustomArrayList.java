package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[100];
	Integer size = 0;

	@Override
	public boolean add(T item) {

		if (size >= items.length) {
			Object[] tempArray = new Object[size * 2];

			for (int i = 0; i < size; i++) {
				tempArray[i] = items[i];
			}

			items = tempArray;
		}

		items[size] = item;
		size++;

		return true;
	}

	@Override
	public int getSize() {

		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		return ((T) items[index]);
	}

}
