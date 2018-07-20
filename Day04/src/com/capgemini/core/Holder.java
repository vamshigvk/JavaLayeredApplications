package com.capgemini.core;

import java.util.LinkedList;

public class Holder<T> 
{
	LinkedList<T> data = new LinkedList<T>();
	
	public void add(T value)
	{
		if(!data.contains(value))
		data.add(value);
	}
	
	public T get(int index) {
		return data.get(index);
	}
}
