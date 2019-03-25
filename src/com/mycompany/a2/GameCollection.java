package com.mycompany.a2;

import java.util.ArrayList;

public class GameCollection implements ICollection
{
	private ArrayList<GameObject> list;
	
	public GameCollection() 
	{
		list = new ArrayList<GameObject>();
	}

	@Override
	public void add(GameObject o) 
	{
		list.add(o);
	}

	@Override
	//Returns the iterator associated with the collection to traverse through the collection
	public IIterator getIterator() 
	{
		return new GameObjectIterator();
	}

	private class GameObjectIterator implements IIterator
	{
		private int index;
		
		public GameObjectIterator()
		{
			index = -1;
		}

		@Override
		public boolean hasNext() {
			if (list.size() <= 0) return false;
			if (index == list.size() - 1) 
			{
				index = -1;
				return false;
			}
			return true;
		}

		@Override
		public Object getNext() {
			index++;
			return list.get(index);
		}
	}
}
