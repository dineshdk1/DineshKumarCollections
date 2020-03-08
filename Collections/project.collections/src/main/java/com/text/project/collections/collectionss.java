package com.text.project.collections;

import java.util.ArrayList;
import java.util.List;

public class collectionss 
{
	
	 List<Integer> list=new ArrayList<Integer>();
	 void adddata()
	 {
		 for(int i=0;i<=10;i++)
			 list.add(i);
	 }
	
	void insert(int element)
	{
		list.add(element);
	}
	void delete(int element)
	{
		try {
		list.remove(list.indexOf(element));
		}
		catch( Exception e)
		{
			System.out.println("element is not present in list");
		}
	}
	int search(int element)
	{
		return list.indexOf(element);
	}
	void print()
	{
		System.out.println(list);
	}
}
